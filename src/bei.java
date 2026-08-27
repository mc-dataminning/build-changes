import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bei(Duration a, cpc b, akh c, dhk d, String e) implements bep {
   public static bei a(RecordedEvent $$0) {
      return new bei(
         $$0.getDuration(),
         new cpc($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new akh($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dhk.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
