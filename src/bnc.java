import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bnc(Duration a, dae b, aqc c, dtw d, String e) implements bnl {
   public static bnc a(RecordedEvent $$0) {
      return new bnc(
         $$0.getDuration(),
         new dae($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqc($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dtw.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
