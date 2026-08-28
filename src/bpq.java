import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bpq(Duration a, dfp b, aqp c, dzu d, String e) implements bqa {
   public static bpq a(RecordedEvent $$0) {
      return new bpq(
         $$0.getDuration(),
         new dfp($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqp($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dzu.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
