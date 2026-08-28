import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record brt(Instant a, Duration b) {
   public static brt a(RecordedEvent $$0) {
      return new brt($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
