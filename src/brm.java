import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record brm(Duration a, dio b, arb c, edm d, String e) implements brw {
   public static brm a(RecordedEvent $$0) {
      return new brm(
         $$0.getDuration(),
         new dio($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new arb($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         edm.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
