import jdk.jfr.consumer.RecordedEvent;

public record bnu(String a, String b, String c) {
   public static bnu a(RecordedEvent $$0) {
      return new bnu($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
