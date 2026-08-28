import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bpn(Duration a, dfm b, aqo c, dzr d, String e) implements bpx {
   public static bpn a(RecordedEvent $$0) {
      return new bpn(
         $$0.getDuration(),
         new dfm($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqo($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dzr.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
