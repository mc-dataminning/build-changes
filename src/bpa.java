import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bpa(Duration a, ddp b, aqw c, dxp d, String e) implements bpj {
   public static bpa a(RecordedEvent $$0) {
      return new bpa(
         $$0.getDuration(),
         new ddp($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqw($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dxp.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
