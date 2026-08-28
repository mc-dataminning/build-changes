import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bod(Duration a, dbg b, aqv c, duy d, String e) implements bom {
   public static bod a(RecordedEvent $$0) {
      return new bod(
         $$0.getDuration(),
         new dbg($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqv($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         duy.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
