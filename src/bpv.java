import jdk.jfr.consumer.RecordedEvent;

public record bpv(String a, String b, String c) {
   public static bpv a(RecordedEvent $$0) {
      return new bpv($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
