import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record brp(Duration a, dic b, String c, String d, boolean e) implements brs {
   public static brp a(RecordedEvent $$0) {
      return new brp(
         $$0.getDuration(),
         new dic($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         $$0.getString("structure"),
         $$0.getString("level"),
         $$0.getBoolean("success")
      );
   }
}
