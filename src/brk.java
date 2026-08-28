import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record brk(Duration a, dih b, arb c, edf d, String e) implements bru {
   public static brk a(RecordedEvent $$0) {
      return new brk(
         $$0.getDuration(),
         new dih($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new arb($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         edf.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
