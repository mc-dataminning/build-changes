import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bkt(Instant a, Duration b) {
   public static bkt a(RecordedEvent $$0) {
      return new bkt($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
