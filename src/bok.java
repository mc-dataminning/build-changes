import jdk.jfr.consumer.RecordedEvent;

public record bok(String a, String b, String c) {
   public static bok a(RecordedEvent $$0) {
      return new bok($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
