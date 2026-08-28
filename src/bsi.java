import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bsi(Duration a, djo b, arm c, eeo d, String e) implements bss {
   public static bsi a(RecordedEvent $$0) {
      return new bsi(
         $$0.getDuration(),
         new djo($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new arm($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         eeo.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
