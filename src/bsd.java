import jdk.jfr.consumer.RecordedEvent;

public record bsd(String a, String b, String c) {
   public static bsd a(RecordedEvent $$0) {
      return new bsd($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
