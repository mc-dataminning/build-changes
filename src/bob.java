import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bob(Duration a, dbe b, aqu c, duw d, String e) implements bok {
   public static bob a(RecordedEvent $$0) {
      return new bob(
         $$0.getDuration(),
         new dbe($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqu($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         duw.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
