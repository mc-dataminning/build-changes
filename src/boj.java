import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record boj(Instant a, Duration b) {
   public static boj a(RecordedEvent $$0) {
      return new boj($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
