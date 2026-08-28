import jdk.jfr.consumer.RecordedEvent;

public record bpd(String a, String b, String c) {
   public static bpd a(RecordedEvent $$0) {
      return new bpd($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
