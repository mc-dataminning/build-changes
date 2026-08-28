import jdk.jfr.consumer.RecordedEvent;

public record brq(String a, String b, String c) {
   public static brq a(RecordedEvent $$0) {
      return new brq($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
