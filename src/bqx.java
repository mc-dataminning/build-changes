import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bqx(Instant a, Duration b) {
   public static bqx a(RecordedEvent $$0) {
      return new bqx($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
