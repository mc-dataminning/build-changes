import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record boh(Instant a, Duration b) {
   public static boh a(RecordedEvent $$0) {
      return new boh($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
