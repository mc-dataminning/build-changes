import jdk.jfr.consumer.RecordedEvent;

public record bsj(String a, String b, int c, int d) {
   public static bsj a(RecordedEvent $$0) {
      return new bsj($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
