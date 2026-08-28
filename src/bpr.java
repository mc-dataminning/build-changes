import jdk.jfr.consumer.RecordedEvent;

public record bpr(String a, String b, int c, int d) {
   public static bpr a(RecordedEvent $$0) {
      return new bpr($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
