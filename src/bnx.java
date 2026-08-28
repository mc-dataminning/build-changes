import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bnx(Instant a, Duration b) {
   public static bnx a(RecordedEvent $$0) {
      return new bnx($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
