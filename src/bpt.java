import jdk.jfr.consumer.RecordedEvent;

public record bpt(String a, String b, String c) {
   public static bpt a(RecordedEvent $$0) {
      return new bpt($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
