import jdk.jfr.consumer.RecordedEvent;

public record bod(String a, String b, String c) {
   public static bod a(RecordedEvent $$0) {
      return new bod($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
