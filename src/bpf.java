import jdk.jfr.consumer.RecordedEvent;

public record bpf(String a, String b, int c, int d) {
   public static bpf a(RecordedEvent $$0) {
      return new bpf($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
