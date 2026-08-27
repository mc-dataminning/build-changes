import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record beu(Instant a, Duration b) {
   public static beu a(RecordedEvent $$0) {
      return new beu($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
