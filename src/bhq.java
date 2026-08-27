import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bhq(Instant a, Duration b) {
   public static bhq a(RecordedEvent $$0) {
      return new bhq($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
