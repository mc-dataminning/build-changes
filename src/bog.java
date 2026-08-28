import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bog(Instant a, Duration b) {
   public static bog a(RecordedEvent $$0) {
      return new bog($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
