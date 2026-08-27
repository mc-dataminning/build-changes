import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bdx(Duration a, cor b, ajy c, dgz d, String e) implements bef {
   public static bdx a(RecordedEvent $$0) {
      return new bdx(
         $$0.getDuration(),
         new cor($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new ajy($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dgz.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
