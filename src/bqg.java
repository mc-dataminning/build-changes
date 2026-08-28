import jdk.jfr.consumer.RecordedEvent;

public record bqg(String a, String b, int c, int d) {
   public static bqg a(RecordedEvent $$0) {
      return new bqg($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
