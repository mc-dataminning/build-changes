import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record blv(Instant a, Duration b) {
   public static blv a(RecordedEvent $$0) {
      return new blv($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
