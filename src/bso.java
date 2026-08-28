import jdk.jfr.consumer.RecordedEvent;

public record bso(String a, String b, String c) {
   public static bso a(RecordedEvent $$0) {
      return new bso($$0.getString("packetDirection"), $$0.getString("protocolId"), $$0.getString("packetId"));
   }
}
