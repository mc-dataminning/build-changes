import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bpo(Duration a, dfo b, aqo c, dzt d, String e) implements bpy {
   public static bpo a(RecordedEvent $$0) {
      return new bpo(
         $$0.getDuration(),
         new dfo($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqo($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dzt.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
