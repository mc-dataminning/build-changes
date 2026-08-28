import jdk.jfr.consumer.RecordedEvent;

public record brg(String a, String b, int c, int d) {
   public static brg a(RecordedEvent $$0) {
      return new brg($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
