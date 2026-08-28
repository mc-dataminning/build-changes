import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bqf(Duration a, dgg b, aqo c, ean d, String e) implements bqp {
   public static bqf a(RecordedEvent $$0) {
      return new bqf(
         $$0.getDuration(),
         new dgg($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqo($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         ean.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
