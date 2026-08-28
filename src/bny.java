import jdk.jfr.consumer.RecordedEvent;

public record bny(String a, String b, int c, int d) {
   public static bny a(RecordedEvent $$0) {
      return new bny($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
