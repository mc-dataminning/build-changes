import jdk.jfr.consumer.RecordedEvent;

public record bnf(String a, String b, int c, int d) {
   public static bnf a(RecordedEvent $$0) {
      return new bnf($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
