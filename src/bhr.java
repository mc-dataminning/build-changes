import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bhr(Instant a, Duration b) {
   public static bhr a(RecordedEvent $$0) {
      return new bhr($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
