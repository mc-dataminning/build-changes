import jdk.jfr.consumer.RecordedEvent;

public record bpq(String a, String b, int c, int d) {
   public static bpq a(RecordedEvent $$0) {
      return new bpq($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
