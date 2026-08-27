import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bhm(Duration a, cte b, amu c, dlq d, String e) implements bht {
   public static bhm a(RecordedEvent $$0) {
      return new bhm(
         $$0.getDuration(),
         new cte($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new amu($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dlq.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
