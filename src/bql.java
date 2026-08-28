import jdk.jfr.consumer.RecordedEvent;

public record bql(String a, String b, String c) {
   public static bql a(RecordedEvent $$0) {
      return new bql($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
