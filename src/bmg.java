import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bmg(Instant a, Duration b) {
   public static bmg a(RecordedEvent $$0) {
      return new bmg($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
