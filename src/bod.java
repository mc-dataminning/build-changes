import jdk.jfr.consumer.RecordedEvent;

public record bod(String a, String b, int c, int d) {
   public static bod a(RecordedEvent $$0) {
      return new bod($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
