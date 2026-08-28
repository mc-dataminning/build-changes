import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bpz(Instant a, Duration b) {
   public static bpz a(RecordedEvent $$0) {
      return new bpz($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
