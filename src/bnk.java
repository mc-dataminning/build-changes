import jdk.jfr.consumer.RecordedEvent;

public record bnk(String a, String b, String c) {
   public static bnk a(RecordedEvent $$0) {
      return new bnk($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
