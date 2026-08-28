import jdk.jfr.consumer.RecordedEvent;

public record bpp(String a, String b, String c) {
   public static bpp a(RecordedEvent $$0) {
      return new bpp($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
