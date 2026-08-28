import jdk.jfr.consumer.RecordedEvent;

public record brl(String a, String b, int c, int d) {
   public static brl a(RecordedEvent $$0) {
      return new brl($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
