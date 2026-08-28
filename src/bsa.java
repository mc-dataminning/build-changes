import jdk.jfr.consumer.RecordedEvent;

public record bsa(String a, String b, int c, int d) {
   public static bsa a(RecordedEvent $$0) {
      return new bsa($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
