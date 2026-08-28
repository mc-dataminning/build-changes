import jdk.jfr.consumer.RecordedEvent;

public record bof(String a, String b, int c, int d) {
   public static bof a(RecordedEvent $$0) {
      return new bof($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
