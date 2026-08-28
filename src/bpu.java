import jdk.jfr.consumer.RecordedEvent;

public record bpu(String a, String b, String c) {
   public static bpu a(RecordedEvent $$0) {
      return new bpu($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
