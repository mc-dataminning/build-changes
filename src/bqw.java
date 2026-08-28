import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bqw(Instant a, Duration b) {
   public static bqw a(RecordedEvent $$0) {
      return new bqw($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
