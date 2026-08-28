import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bqo(Instant a, Duration b) {
   public static bqo a(RecordedEvent $$0) {
      return new bqo($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
