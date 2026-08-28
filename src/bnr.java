import jdk.jfr.consumer.RecordedEvent;

public record bnr(String a, String b, String c) {
   public static bnr a(RecordedEvent $$0) {
      return new bnr($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
