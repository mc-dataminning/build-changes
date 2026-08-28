import jdk.jfr.consumer.RecordedEvent;

public record bpg(String a, String b, String c) {
   public static bpg a(RecordedEvent $$0) {
      return new bpg($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
