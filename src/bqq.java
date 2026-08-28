import jdk.jfr.consumer.RecordedEvent;

public record bqq(String a, String b, int c, int d) {
   public static bqq a(RecordedEvent $$0) {
      return new bqq($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
