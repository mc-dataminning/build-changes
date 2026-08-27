import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bgl(Duration a, crm b, aly c, djo d, String e) implements bgs {
   public static bgl a(RecordedEvent $$0) {
      return new bgl(
         $$0.getDuration(),
         new crm($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aly($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         djo.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
