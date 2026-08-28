import jdk.jfr.consumer.RecordedEvent;

public record bpo(String a, String b, int c, int d) {
   public static bpo a(RecordedEvent $$0) {
      return new bpo($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
