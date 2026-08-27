import jdk.jfr.consumer.RecordedEvent;

public record bno(String a, String b, String c) {
   public static bno a(RecordedEvent $$0) {
      return new bno($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
