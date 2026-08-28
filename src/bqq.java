import jdk.jfr.consumer.RecordedEvent;

public record bqq(String a, String b, String c) {
   public static bqq a(RecordedEvent $$0) {
      return new bqq($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
