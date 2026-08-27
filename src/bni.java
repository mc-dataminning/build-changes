import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bni(Duration a, dbh b, aqj c, dvx d, String e) implements bnr {
   public static bni a(RecordedEvent $$0) {
      return new bni(
         $$0.getDuration(),
         new dbh($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqj($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dvx.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
