import jdk.jfr.consumer.RecordedEvent;

public record bpb(String a, String b, int c, int d) {
   public static bpb a(RecordedEvent $$0) {
      return new bpb($$0.getString("level"), $$0.getString("dimension"), $$0.getInt("chunkPosX"), $$0.getInt("chunkPosZ"));
   }
}
