import jdk.jfr.consumer.RecordedEvent;

public record bpk(String a, String b, int c, int d) {
   public static bpk a(RecordedEvent $$0) {
      return new bpk($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
