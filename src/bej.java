import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bej(Instant a, Duration b) {
   public static bej a(RecordedEvent $$0) {
      return new bej($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
