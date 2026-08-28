import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bpu(Duration a, dfm b, String c, String d, boolean e) implements bpx {
   public static bpu a(RecordedEvent $$0) {
      return new bpu(
         $$0.getDuration(),
         new dfm($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         $$0.getString("structure"),
         $$0.getString("level"),
         $$0.getBoolean("success")
      );
   }
}
