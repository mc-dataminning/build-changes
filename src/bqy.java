import jdk.jfr.consumer.RecordedEvent;

public record bqy(String a, String b, int c, int d) {
   public static bqy a(RecordedEvent $$0) {
      return new bqy($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
