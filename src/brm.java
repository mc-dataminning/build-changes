import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record brm(Duration a, dhw b, String c, String d, boolean e) implements brp {
   public static brm a(RecordedEvent $$0) {
      return new brm(
         $$0.getDuration(),
         new dhw($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         $$0.getString("structure"),
         $$0.getString("level"),
         $$0.getBoolean("success")
      );
   }
}
