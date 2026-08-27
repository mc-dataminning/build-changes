import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bnc(Instant a, Duration b) {
   public static bnc a(RecordedEvent $$0) {
      return new bnc($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
