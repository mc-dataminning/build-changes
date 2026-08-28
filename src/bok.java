import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bok(Instant a, Duration b) {
   public static bok a(RecordedEvent $$0) {
      return new bok($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
