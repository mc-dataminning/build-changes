import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record brr(Instant a, Duration b) {
   public static brr a(RecordedEvent $$0) {
      return new brr($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
