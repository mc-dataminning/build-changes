import jdk.jfr.consumer.RecordedEvent;

public record bnm(String a, String b, int c, int d) {
   public static bnm a(RecordedEvent $$0) {
      return new bnm($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
