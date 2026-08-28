import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bnz(Duration a, dcd b, aqi c, dvz d, String e) implements boi {
   public static bnz a(RecordedEvent $$0) {
      return new bnz(
         $$0.getDuration(),
         new dcd($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqi($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dvz.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
