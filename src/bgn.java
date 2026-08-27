import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bgn(Instant a, Duration b) {
   public static bgn a(RecordedEvent $$0) {
      return new bgn($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
