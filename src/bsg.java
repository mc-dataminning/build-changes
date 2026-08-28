import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bsg(Duration a, dje b, String c, String d, boolean e) implements bsj {
   public static bsg a(RecordedEvent $$0) {
      return new bsg(
         $$0.getDuration(),
         new dje($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         $$0.getString("structure"),
         $$0.getString("level"),
         $$0.getBoolean("success")
      );
   }
}
