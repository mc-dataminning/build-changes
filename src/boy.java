import jdk.jfr.consumer.RecordedEvent;

public record boy(String a, String b, String c) {
   public static boy a(RecordedEvent $$0) {
      return new boy($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
