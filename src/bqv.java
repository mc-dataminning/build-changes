import jdk.jfr.consumer.RecordedEvent;

public record bqv(String a, String b, String c) {
   public static bqv a(RecordedEvent $$0) {
      return new bqv($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
