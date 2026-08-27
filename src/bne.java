import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bne(Duration a, dag b, aqd c, dty d, String e) implements bnn {
   public static bne a(RecordedEvent $$0) {
      return new bne(
         $$0.getDuration(),
         new dag($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqd($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dty.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
