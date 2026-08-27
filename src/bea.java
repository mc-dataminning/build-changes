import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bea(Duration a, cot b, aka c, dhb d, String e) implements beh {
   public static bea a(RecordedEvent $$0) {
      return new bea(
         $$0.getDuration(),
         new cot($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aka($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dhb.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
