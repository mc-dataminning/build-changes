import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record brz(Duration a, dje b, arf c, eee d, String e) implements bsj {
   public static brz a(RecordedEvent $$0) {
      return new brz(
         $$0.getDuration(),
         new dje($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new arf($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         eee.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
