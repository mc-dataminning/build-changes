import jdk.jfr.consumer.RecordedEvent;

public record bni(String a, String b, String c) {
   public static bni a(RecordedEvent $$0) {
      return new bni($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
