import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bhl(Duration a, csw b, amt c, dli d, String e) implements bhs {
   public static bhl a(RecordedEvent $$0) {
      return new bhl(
         $$0.getDuration(),
         new csw($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new amt($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dli.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
