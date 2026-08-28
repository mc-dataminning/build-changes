import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bse(Duration a, djc b, String c, String d, boolean e) implements bsh {
   public static bse a(RecordedEvent $$0) {
      return new bse(
         $$0.getDuration(),
         new djc($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         $$0.getString("structure"),
         $$0.getString("level"),
         $$0.getBoolean("success")
      );
   }
}
