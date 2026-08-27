import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bga(Duration a, cqz b, alq c, dix d, String e) implements bgh {
   public static bga a(RecordedEvent $$0) {
      return new bga(
         $$0.getDuration(),
         new cqz($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new alq($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dix.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
