import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bpi(Instant a, Duration b) {
   public static bpi a(RecordedEvent $$0) {
      return new bpi($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
