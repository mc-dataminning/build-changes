import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bqf(Duration a, dgf b, arj c, eak d, String e) implements bqp {
   public static bqf a(RecordedEvent $$0) {
      return new bqf(
         $$0.getDuration(),
         new dgf($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new arj($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         eak.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
