import jdk.jfr.consumer.RecordedEvent;

public record bsf(String a, String b, String c) {
   public static bsf a(RecordedEvent $$0) {
      return new bsf($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
