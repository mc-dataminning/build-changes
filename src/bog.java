import jdk.jfr.consumer.RecordedEvent;

public record bog(String a, String b, String c) {
   public static bog a(RecordedEvent $$0) {
      return new bog($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
