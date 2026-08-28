import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bri(Duration a, dic b, arb c, ecx d, String e) implements brs {
   public static bri a(RecordedEvent $$0) {
      return new bri(
         $$0.getDuration(),
         new dic($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new arb($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         ecx.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
