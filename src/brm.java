import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record brm(Duration a, dir b, arb c, edr d, String e) implements brw {
   public static brm a(RecordedEvent $$0) {
      return new brm(
         $$0.getDuration(),
         new dir($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new arb($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         edr.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
