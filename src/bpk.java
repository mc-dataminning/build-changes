import jdk.jfr.consumer.RecordedEvent;

public record bpk(String a, String b, String c) {
   public static bpk a(RecordedEvent $$0) {
      return new bpk($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
