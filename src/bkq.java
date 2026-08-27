import jdk.jfr.consumer.RecordedEvent;

public record bkq(String a, String b, String c) {
   public static bkq a(RecordedEvent $$0) {
      return new bkq($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
