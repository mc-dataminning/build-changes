import jdk.jfr.consumer.RecordedEvent;

public record bot(String a, String b, int c, int d) {
   public static bot a(RecordedEvent $$0) {
      return new bot($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
