import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bqm(Duration a, dgf b, String c, String d, boolean e) implements bqp {
   public static bqm a(RecordedEvent $$0) {
      return new bqm(
         $$0.getDuration(),
         new dgf($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         $$0.getString("structure"),
         $$0.getString("level"),
         $$0.getBoolean("success")
      );
   }
}
