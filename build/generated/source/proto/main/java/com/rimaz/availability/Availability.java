// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: availability.proto

package com.rimaz.availability;

public final class Availability {
  private Availability() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_AvailabilityRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_AvailabilityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_AvailabilityResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_AvailabilityResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022availability.proto\022\005proto\"(\n\023Availabil" +
      "ityRequest\022\021\n\tflight_id\030\001 \001(\005\"%\n\024Availab" +
      "ilityResponse\022\r\n\005seats\030\001 \001(\0052`\n\023Availabi" +
      "lityService\022I\n\014Availability\022\032.proto.Avai" +
      "labilityRequest\032\033.proto.AvailabilityResp" +
      "onse\"\000B\032\n\026com.rimaz.availabilityP\001b\006prot" +
      "o3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_proto_AvailabilityRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_AvailabilityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_AvailabilityRequest_descriptor,
        new java.lang.String[] { "FlightId", });
    internal_static_proto_AvailabilityResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_AvailabilityResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_AvailabilityResponse_descriptor,
        new java.lang.String[] { "Seats", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
