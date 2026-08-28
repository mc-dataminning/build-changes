import jdk.jfr.consumer.RecordedEvent;

public record brj(String a, String b, int c, int d) {
   public static brj a(RecordedEvent $$0) {
      return new brj($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
