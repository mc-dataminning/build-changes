import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bsg(Instant a, Duration b) {
   public static bsg a(RecordedEvent $$0) {
      return new bsg($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
