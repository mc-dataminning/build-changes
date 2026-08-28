import jdk.jfr.consumer.RecordedEvent;

public record bpp(String a, String b, int c, int d) {
   public static bpp a(RecordedEvent $$0) {
      return new bpp($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
