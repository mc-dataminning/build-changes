import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bsi(Instant a, Duration b) {
   public static bsi a(RecordedEvent $$0) {
      return new bsi($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
