import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record beg(Instant a, Duration b) {
   public static beg a(RecordedEvent $$0) {
      return new beg($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
