import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bpr(Instant a, Duration b) {
   public static bpr a(RecordedEvent $$0) {
      return new bpr($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
