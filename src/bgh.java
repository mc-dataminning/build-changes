import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bgh(Duration a, crh b, alu c, djj d, String e) implements bgo {
   public static bgh a(RecordedEvent $$0) {
      return new bgh(
         $$0.getDuration(),
         new crh($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new alu($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         djj.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
