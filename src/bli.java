import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bli(Duration a, cye b, api c, dru d, String e) implements blr {
   public static bli a(RecordedEvent $$0) {
      return new bli(
         $$0.getDuration(),
         new cye($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new api($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dru.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
