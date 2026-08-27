import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bhl(Instant a, Duration b) {
   public static bhl a(RecordedEvent $$0) {
      return new bhl($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
