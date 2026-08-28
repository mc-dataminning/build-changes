import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bpp(Duration a, dfo b, aqp c, dzt d, String e) implements bpz {
   public static bpp a(RecordedEvent $$0) {
      return new bpp(
         $$0.getDuration(),
         new dfo($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqp($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dzt.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
