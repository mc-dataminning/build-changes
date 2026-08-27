import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bfr(Instant a, Duration b) {
   public static bfr a(RecordedEvent $$0) {
      return new bfr($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
