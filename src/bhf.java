import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bhf(Duration a, csp b, amp c, dlb d, String e) implements bhm {
   public static bhf a(RecordedEvent $$0) {
      return new bhf(
         $$0.getDuration(),
         new csp($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new amp($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dlb.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
