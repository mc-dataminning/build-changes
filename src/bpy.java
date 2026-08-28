import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record bpy(Instant a, Duration b) {
   public static bpy a(RecordedEvent $$0) {
      return new bpy($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
