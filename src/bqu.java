import jdk.jfr.consumer.RecordedEvent;

public record bqu(String a, String b, String c) {
   public static bqu a(RecordedEvent $$0) {
      return new bqu($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
