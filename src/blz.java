import jdk.jfr.consumer.RecordedEvent;

public record blz(String a, String b, int c, int d) {
   public static blz a(RecordedEvent $$0) {
      return new blz($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
