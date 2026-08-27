import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record beq(Instant a, Duration b) {
   public static beq a(RecordedEvent $$0) {
      return new beq($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
