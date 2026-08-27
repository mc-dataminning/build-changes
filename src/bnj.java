import jdk.jfr.consumer.RecordedEvent;

public record bnj(String a, String b, int c, int d) {
   public static bnj a(RecordedEvent $$0) {
      return new bnj($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
