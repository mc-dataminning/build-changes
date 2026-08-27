import jdk.jfr.consumer.RecordedEvent;

public record bme(String a, String b, String c) {
   public static bme a(RecordedEvent $$0) {
      return new bme($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
