import jdk.jfr.consumer.RecordedEvent;

public record bnp(String a, String b, int c, int d) {
   public static bnp a(RecordedEvent $$0) {
      return new bnp($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
