import jdk.jfr.consumer.RecordedEvent;

public record boi(String a, String b, String c) {
   public static boi a(RecordedEvent $$0) {
      return new boi($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
