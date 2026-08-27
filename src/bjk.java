import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bjk(Instant a, Duration b) {
   public static bjk a(RecordedEvent $$0) {
      return new bjk($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
