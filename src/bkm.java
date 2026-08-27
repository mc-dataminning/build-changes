import jdk.jfr.consumer.RecordedEvent;

public record bkm(String a, String b, int c, int d) {
   public static bkm a(RecordedEvent $$0) {
      return new bkm($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
