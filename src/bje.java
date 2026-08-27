import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bje(Duration a, cuu b, aol c, dng d, String e) implements bjl {
   public static bje a(RecordedEvent $$0) {
      return new bje(
         $$0.getDuration(),
         new cuu($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aol($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dng.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
