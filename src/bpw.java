import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bpw(Duration a, dfo b, String c, String d, boolean e) implements bpz {
   public static bpw a(RecordedEvent $$0) {
      return new bpw(
         $$0.getDuration(),
         new dfo($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         $$0.getString("structure"),
         $$0.getString("level"),
         $$0.getBoolean("success")
      );
   }
}
