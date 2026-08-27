import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bly(Duration a, czb b, apu c, dst d, String e) implements bmh {
   public static bly a(RecordedEvent $$0) {
      return new bly(
         $$0.getDuration(),
         new czb($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new apu($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dst.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
