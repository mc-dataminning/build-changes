import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bre(Duration a, dgw b, String c, String d, boolean e) implements brh {
   public static bre a(RecordedEvent $$0) {
      return new bre(
         $$0.getDuration(),
         new dgw($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         $$0.getString("structure"),
         $$0.getString("level"),
         $$0.getBoolean("success")
      );
   }
}
