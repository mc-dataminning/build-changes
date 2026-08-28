import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bnx(Duration a, dba b, aqr c, dus d, String e) implements bog {
   public static bnx a(RecordedEvent $$0) {
      return new bnx(
         $$0.getDuration(),
         new dba($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqr($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dus.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
