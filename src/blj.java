import jdk.jfr.consumer.RecordedEvent;

public record blj(String a, String b, int c, int d) {
   public static blj a(RecordedEvent $$0) {
      return new blj($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
