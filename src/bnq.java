import jdk.jfr.consumer.RecordedEvent;

public record bnq(String a, String b, int c, int d) {
   public static bnq a(RecordedEvent $$0) {
      return new bnq($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
