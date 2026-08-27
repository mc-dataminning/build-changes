import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record beo(Instant a, Duration b) {
   public static beo a(RecordedEvent $$0) {
      return new beo($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
