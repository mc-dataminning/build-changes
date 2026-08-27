import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bbm(Instant a, Duration b) {
   public static bbm a(RecordedEvent $$0) {
      return new bbm($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
