import jdk.jfr.consumer.RecordedEvent;

public record bkr(String a, String b, String c) {
   public static bkr a(RecordedEvent $$0) {
      return new bkr($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
