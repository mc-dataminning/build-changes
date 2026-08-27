import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bnm(Instant a, Duration b) {
   public static bnm a(RecordedEvent $$0) {
      return new bnm($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
