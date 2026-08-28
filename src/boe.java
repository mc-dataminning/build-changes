import jdk.jfr.consumer.RecordedEvent;

public record boe(String a, String b, int c, int d) {
   public static boe a(RecordedEvent $$0) {
      return new boe($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
