import jdk.jfr.consumer.RecordedEvent;

public record blt(String a, String b, String c) {
   public static blt a(RecordedEvent $$0) {
      return new blt($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
