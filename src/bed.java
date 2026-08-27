import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bed(Instant a, Duration b) {
   public static bed a(RecordedEvent $$0) {
      return new bed($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
