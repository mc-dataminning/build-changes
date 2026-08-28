import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bpw(Instant a, Duration b) {
   public static bpw a(RecordedEvent $$0) {
      return new bpw($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
