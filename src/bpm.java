import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bpm(Instant a, Duration b) {
   public static bpm a(RecordedEvent $$0) {
      return new bpm($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
