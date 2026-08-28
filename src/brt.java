import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record brt(Duration a, dir b, String c, String d, boolean e) implements brw {
   public static brt a(RecordedEvent $$0) {
      return new brt(
         $$0.getDuration(),
         new dir($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         $$0.getString("structure"),
         $$0.getString("level"),
         $$0.getBoolean("success")
      );
   }
}
