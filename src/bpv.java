import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bpv(Duration a, dfo b, String c, String d, boolean e) implements bpy {
   public static bpv a(RecordedEvent $$0) {
      return new bpv(
         $$0.getDuration(),
         new dfo($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         $$0.getString("structure"),
         $$0.getString("level"),
         $$0.getBoolean("success")
      );
   }
}
