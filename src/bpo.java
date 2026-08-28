import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bpo(Duration a, dfn b, aqp c, dzs d, String e) implements bpy {
   public static bpo a(RecordedEvent $$0) {
      return new bpo(
         $$0.getDuration(),
         new dfn($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqp($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dzs.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
