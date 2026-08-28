import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record boi(Instant a, Duration b) {
   public static boi a(RecordedEvent $$0) {
      return new boi($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
