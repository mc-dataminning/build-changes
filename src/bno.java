import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bno(Duration a, dbm b, aqa c, dvh d, String e) implements bnx {
   public static bno a(RecordedEvent $$0) {
      return new bno(
         $$0.getDuration(),
         new dbm($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new aqa($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dvh.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
