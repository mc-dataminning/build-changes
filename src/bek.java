import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bek(Duration a, cpe b, aki c, dhm d, String e) implements ber {
   public static bek a(RecordedEvent $$0) {
      return new bek(
         $$0.getDuration(),
         new cpe($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aki($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dhm.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
