import jdk.jfr.consumer.RecordedEvent;

public record boh(String a, String b, String c) {
   public static boh a(RecordedEvent $$0) {
      return new boh($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
