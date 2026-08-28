import jdk.jfr.consumer.RecordedEvent;

public record brd(String a, String b, String c) {
   public static brd a(RecordedEvent $$0) {
      return new brd($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
