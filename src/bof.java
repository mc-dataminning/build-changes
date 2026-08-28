import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bof(Instant a, Duration b) {
   public static bof a(RecordedEvent $$0) {
      return new bof($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
