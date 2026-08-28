import jdk.jfr.consumer.RecordedEvent;

public record bql(String a, String b, int c, int d) {
   public static bql a(RecordedEvent $$0) {
      return new bql($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
