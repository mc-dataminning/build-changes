import jdk.jfr.consumer.RecordedEvent;

public record brs(String a, String b, String c) {
   public static brs a(RecordedEvent $$0) {
      return new brs($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
