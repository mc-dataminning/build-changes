import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bnk(Instant a, Duration b) {
   public static bnk a(RecordedEvent $$0) {
      return new bnk($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
