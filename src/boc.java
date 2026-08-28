import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record boc(Duration a, dbf b, aqv c, dux d, String e) implements bol {
   public static boc a(RecordedEvent $$0) {
      return new boc(
         $$0.getDuration(),
         new dbf($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqv($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dux.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
