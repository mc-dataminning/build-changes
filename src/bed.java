import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bed(Duration a, cox b, akd c, dhf d, String e) implements bek {
   public static bed a(RecordedEvent $$0) {
      return new bed(
         $$0.getDuration(),
         new cox($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new akd($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dhf.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
