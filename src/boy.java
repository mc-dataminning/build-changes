import jdk.jfr.consumer.RecordedEvent;

public record boy(String a, String b, int c, int d) {
   public static boy a(RecordedEvent $$0) {
      return new boy($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
