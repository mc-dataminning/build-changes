import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bpn(Duration a, del b, ard c, dyk d, String e) implements bpw {
   public static bpn a(RecordedEvent $$0) {
      return new bpn(
         $$0.getDuration(),
         new del($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new ard($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dyk.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
