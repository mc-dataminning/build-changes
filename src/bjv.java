import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bjv(Duration a, cvl b, aoq c, dof d, String e) implements bkc {
   public static bjv a(RecordedEvent $$0) {
      return new bjv(
         $$0.getDuration(),
         new cvl($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aoq($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dof.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
