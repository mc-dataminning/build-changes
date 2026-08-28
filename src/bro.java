import jdk.jfr.consumer.RecordedEvent;

public record bro(String a, String b, String c) {
   public static bro a(RecordedEvent $$0) {
      return new bro($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
