import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record brx(Duration a, djc b, ard c, eec d, String e) implements bsh {
   public static brx a(RecordedEvent $$0) {
      return new brx(
         $$0.getDuration(),
         new djc($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new ard($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         eec.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
