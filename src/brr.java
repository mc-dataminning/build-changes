import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record brr(Duration a, dih b, String c, String d, boolean e) implements bru {
   public static brr a(RecordedEvent $$0) {
      return new brr(
         $$0.getDuration(),
         new dih($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         $$0.getString("structure"),
         $$0.getString("level"),
         $$0.getBoolean("success")
      );
   }
}
