import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bpj(Duration a, deh b, ara c, dyg d, String e) implements bps {
   public static bpj a(RecordedEvent $$0) {
      return new bpj(
         $$0.getDuration(),
         new deh($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new ara($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dyg.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
