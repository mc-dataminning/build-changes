import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bgr(Instant a, Duration b) {
   public static bgr a(RecordedEvent $$0) {
      return new bgr($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
