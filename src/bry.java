import jdk.jfr.consumer.RecordedEvent;

public record bry(String a, String b, int c, int d) {
   public static bry a(RecordedEvent $$0) {
      return new bry($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
