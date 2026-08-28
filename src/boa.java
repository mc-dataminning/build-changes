import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record boa(Duration a, dbd b, aqu c, duv d, String e) implements boj {
   public static boa a(RecordedEvent $$0) {
      return new boa(
         $$0.getDuration(),
         new dbd($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqu($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         duv.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
