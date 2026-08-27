import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bjg(Duration a, cuy b, aom c, dnk d, String e) implements bjn {
   public static bjg a(RecordedEvent $$0) {
      return new bjg(
         $$0.getDuration(),
         new cuy($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aom($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dnk.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
