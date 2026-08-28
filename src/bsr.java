import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bsr(Instant a, Duration b) {
   public static bsr a(RecordedEvent $$0) {
      return new bsr($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
