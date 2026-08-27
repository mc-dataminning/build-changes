import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bhs(Instant a, Duration b) {
   public static bhs a(RecordedEvent $$0) {
      return new bhs($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
