import jdk.jfr.consumer.RecordedEvent;

public record blo(String a, String b, String c) {
   public static blo a(RecordedEvent $$0) {
      return new blo($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
