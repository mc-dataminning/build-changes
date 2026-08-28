import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bsp(Duration a, djo b, String c, String d, boolean e) implements bss {
   public static bsp a(RecordedEvent $$0) {
      return new bsp(
         $$0.getDuration(),
         new djo($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         $$0.getString("structure"),
         $$0.getString("level"),
         $$0.getBoolean("success")
      );
   }
}
