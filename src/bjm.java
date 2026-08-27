import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bjm(Instant a, Duration b) {
   public static bjm a(RecordedEvent $$0) {
      return new bjm($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
