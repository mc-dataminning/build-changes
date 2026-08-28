import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bqp(Duration a, dgo b, art c, ear d, String e) implements bqy {
   public static bqp a(RecordedEvent $$0) {
      return new bqp(
         $$0.getDuration(),
         new dgo($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new art($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         ear.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
