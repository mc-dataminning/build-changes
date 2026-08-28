import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bpf(Instant a, Duration b) {
   public static bpf a(RecordedEvent $$0) {
      return new bpf($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
