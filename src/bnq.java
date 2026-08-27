import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bnq(Instant a, Duration b) {
   public static bnq a(RecordedEvent $$0) {
      return new bnq($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
