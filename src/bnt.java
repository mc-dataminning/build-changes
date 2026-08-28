import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bnt(Instant a, Duration b) {
   public static bnt a(RecordedEvent $$0) {
      return new bnt($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
