import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bny(Duration a, dcb b, aqh c, dvx d, String e) implements boh {
   public static bny a(RecordedEvent $$0) {
      return new bny(
         $$0.getDuration(),
         new dcb($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqh($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dvx.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
