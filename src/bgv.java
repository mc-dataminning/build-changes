import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bgv(Duration a, csf b, amf c, dkq d, String e) implements bhc {
   public static bgv a(RecordedEvent $$0) {
      return new bgv(
         $$0.getDuration(),
         new csf($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new amf($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dkq.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
