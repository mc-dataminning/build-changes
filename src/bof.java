import jdk.jfr.consumer.RecordedEvent;

public record bof(String a, String b, String c) {
   public static bof a(RecordedEvent $$0) {
      return new bof($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
