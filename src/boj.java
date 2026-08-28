import jdk.jfr.consumer.RecordedEvent;

public record boj(String a, String b, String c) {
   public static boj a(RecordedEvent $$0) {
      return new boj($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
