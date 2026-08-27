import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bea(Duration a, cos b, aka c, dha d, String e) implements beh {
   public static bea a(RecordedEvent $$0) {
      return new bea(
         $$0.getDuration(),
         new cos($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aka($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dha.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
