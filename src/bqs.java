import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bqs(Instant a, Duration b) {
   public static bqs a(RecordedEvent $$0) {
      return new bqs($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
