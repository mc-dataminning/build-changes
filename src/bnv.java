import jdk.jfr.consumer.RecordedEvent;

public record bnv(String a, String b, String c) {
   public static bnv a(RecordedEvent $$0) {
      return new bnv($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
