import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bpa(Instant a, Duration b) {
   public static bpa a(RecordedEvent $$0) {
      return new bpa($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
