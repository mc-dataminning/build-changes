import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bpq(Duration a, des b, arb c, dyr d, String e) implements bpz {
   public static bpq a(RecordedEvent $$0) {
      return new bpq(
         $$0.getDuration(),
         new des($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new arb($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dyr.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
