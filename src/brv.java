import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record brv(Instant a, Duration b) {
   public static brv a(RecordedEvent $$0) {
      return new brv($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
