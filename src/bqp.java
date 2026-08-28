import jdk.jfr.consumer.RecordedEvent;

public record bqp(String a, String b, int c, int d) {
   public static bqp a(RecordedEvent $$0) {
      return new bqp($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
