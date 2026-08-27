import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bkb(Instant a, Duration b) {
   public static bkb a(RecordedEvent $$0) {
      return new bkb($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
