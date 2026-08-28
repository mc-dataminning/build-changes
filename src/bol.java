import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bol(Instant a, Duration b) {
   public static bol a(RecordedEvent $$0) {
      return new bol($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
