import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bmu(Duration a, czk b, apx c, dtc d, String e) implements bnd {
   public static bmu a(RecordedEvent $$0) {
      return new bmu(
         $$0.getDuration(),
         new czk($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new apx($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dtc.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
