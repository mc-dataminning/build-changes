import jdk.jfr.consumer.RecordedEvent;

public record boe(String a, String b, String c) {
   public static boe a(RecordedEvent $$0) {
      return new boe($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
