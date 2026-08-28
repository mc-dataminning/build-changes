import jdk.jfr.consumer.RecordedEvent;

public record boa(String a, String b, int c, int d) {
   public static boa a(RecordedEvent $$0) {
      return new boa($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
