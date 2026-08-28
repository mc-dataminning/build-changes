import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bnl(Duration a, dbk b, aqa c, dvc d, String e) implements bnu {
   public static bnl a(RecordedEvent $$0) {
      return new bnl(
         $$0.getDuration(),
         new dbk($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqa($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dvc.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
