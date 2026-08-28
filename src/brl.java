import jdk.jfr.consumer.RecordedEvent;

public record brl(String a, String b, String c) {
   public static brl a(RecordedEvent $$0) {
      return new brl($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
