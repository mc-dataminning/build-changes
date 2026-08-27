import jdk.jfr.consumer.RecordedEvent;

public record bkl(String a, String b, int c, int d) {
   public static bkl a(RecordedEvent $$0) {
      return new bkl($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
