import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bpx(Instant a, Duration b) {
   public static bpx a(RecordedEvent $$0) {
      return new bpx($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
