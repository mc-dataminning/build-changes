import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bqx(Duration a, dgw b, aqy c, ebk d, String e) implements brh {
   public static bqx a(RecordedEvent $$0) {
      return new bqx(
         $$0.getDuration(),
         new dgw($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqy($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         ebk.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
