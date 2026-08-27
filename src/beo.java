import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record beo(Duration a, cpi b, akj c, dhe d, String e) implements bev {
   public static beo a(RecordedEvent $$0) {
      return new beo(
         $$0.getDuration(),
         new cpi($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new akj($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dhe.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
