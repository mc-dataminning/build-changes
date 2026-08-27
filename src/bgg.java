import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bgg(Instant a, Duration b) {
   public static bgg a(RecordedEvent $$0) {
      return new bgg($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
