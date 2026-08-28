import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bpv(Instant a, Duration b) {
   public static bpv a(RecordedEvent $$0) {
      return new bpv($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
