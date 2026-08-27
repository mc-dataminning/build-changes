import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bkk(Duration a, cwg b, aov c, dpa d, String e) implements bkt {
   public static bkk a(RecordedEvent $$0) {
      return new bkk(
         $$0.getDuration(),
         new cwg($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aov($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dpa.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
