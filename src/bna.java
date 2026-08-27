import jdk.jfr.consumer.RecordedEvent;

public record bna(String a, String b, String c) {
   public static bna a(RecordedEvent $$0) {
      return new bna($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
