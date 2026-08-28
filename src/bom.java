import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bom(Instant a, Duration b) {
   public static bom a(RecordedEvent $$0) {
      return new bom($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
