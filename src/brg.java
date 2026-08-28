import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record brg(Instant a, Duration b) {
   public static brg a(RecordedEvent $$0) {
      return new brg($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
