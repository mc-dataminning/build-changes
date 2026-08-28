import jdk.jfr.consumer.RecordedEvent;

public record bnz(String a, String b, int c, int d) {
   public static bnz a(RecordedEvent $$0) {
      return new bnz($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
