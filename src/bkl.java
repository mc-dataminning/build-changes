import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bkl(Duration a, cwi b, aov c, dpc d, String e) implements bku {
   public static bkl a(RecordedEvent $$0) {
      return new bkl(
         $$0.getDuration(),
         new cwi($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aov($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dpc.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
