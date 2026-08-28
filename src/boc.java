import jdk.jfr.consumer.RecordedEvent;

public record boc(String a, String b, int c, int d) {
   public static boc a(RecordedEvent $$0) {
      return new boc($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
