import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bqo(Duration a, dgn b, art c, eaq d, String e) implements bqx {
   public static bqo a(RecordedEvent $$0) {
      return new bqo(
         $$0.getDuration(),
         new dgn($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new art($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         eaq.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
