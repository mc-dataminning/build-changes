import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bnw(Instant a, Duration b) {
   public static bnw a(RecordedEvent $$0) {
      return new bnw($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
