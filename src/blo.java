import jdk.jfr.consumer.RecordedEvent;

public record blo(String a, String b, int c, int d) {
   public static blo a(RecordedEvent $$0) {
      return new blo($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
