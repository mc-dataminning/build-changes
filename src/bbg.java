import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bbg(Duration a, clt b, ahv c, dec d, String e) implements bbo {
   public static bbg a(RecordedEvent $$0) {
      return new bbg(
         $$0.getDuration(),
         new clt($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new ahv($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dec.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
