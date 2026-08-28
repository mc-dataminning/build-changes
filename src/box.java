import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record box(Duration a, ddm b, aqu c, dxl d, String e) implements bpg {
   public static box a(RecordedEvent $$0) {
      return new box(
         $$0.getDuration(),
         new ddm($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqu($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dxl.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
