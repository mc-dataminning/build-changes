import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bnp(Duration a, dbn b, aqa c, dvi d, String e) implements bny {
   public static bnp a(RecordedEvent $$0) {
      return new bnp(
         $$0.getDuration(),
         new dbn($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqa($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dvi.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
