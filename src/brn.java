import jdk.jfr.consumer.RecordedEvent;

public record brn(String a, String b, int c, int d) {
   public static brn a(RecordedEvent $$0) {
      return new brn($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
