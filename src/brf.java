import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record brf(Duration a, dhw b, aqz c, ecm d, String e) implements brp {
   public static brf a(RecordedEvent $$0) {
      return new brf(
         $$0.getDuration(),
         new dhw($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqz($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         ecm.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
