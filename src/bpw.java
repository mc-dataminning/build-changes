import jdk.jfr.consumer.RecordedEvent;

public record bpw(String a, String b, String c) {
   public static bpw a(RecordedEvent $$0) {
      return new bpw($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
