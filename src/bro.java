import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bro(Instant a, Duration b) {
   public static bro a(RecordedEvent $$0) {
      return new bro($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
