import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bhb(Instant a, Duration b) {
   public static bhb a(RecordedEvent $$0) {
      return new bhb($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
