import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bpx(Duration a, dfp b, String c, String d, boolean e) implements bqa {
   public static bpx a(RecordedEvent $$0) {
      return new bpx(
         $$0.getDuration(),
         new dfp($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         $$0.getString("structure"),
         $$0.getString("level"),
         $$0.getBoolean("success")
      );
   }
}
