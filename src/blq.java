import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record blq(Instant a, Duration b) {
   public static blq a(RecordedEvent $$0) {
      return new blq($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
