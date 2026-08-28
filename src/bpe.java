import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bpe(Duration a, deb b, aqz c, dya d, String e) implements bpn {
   public static bpe a(RecordedEvent $$0) {
      return new bpe(
         $$0.getDuration(),
         new deb($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqz($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dya.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
