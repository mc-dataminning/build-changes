import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bos(Duration a, dcy b, aqt c, dwx d, String e) implements bpb {
   public static bos a(RecordedEvent $$0) {
      return new bos(
         $$0.getDuration(),
         new dcy($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqt($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dwx.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
