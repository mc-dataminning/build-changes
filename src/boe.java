import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record boe(Duration a, dbh b, aqv c, duz d, String e) implements bon {
   public static boe a(RecordedEvent $$0) {
      return new boe(
         $$0.getDuration(),
         new dbh($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqv($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         duz.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
