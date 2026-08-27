import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bhk(Duration a, csv b, amt c, dlh d, String e) implements bhr {
   public static bhk a(RecordedEvent $$0) {
      return new bhk(
         $$0.getDuration(),
         new csv($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new amt($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dlh.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
