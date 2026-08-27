import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bks(Instant a, Duration b) {
   public static bks a(RecordedEvent $$0) {
      return new bks($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
