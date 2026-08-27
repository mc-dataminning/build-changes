import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bln(Duration a, cyn b, apk c, dsd d, String e) implements blw {
   public static bln a(RecordedEvent $$0) {
      return new bln(
         $$0.getDuration(),
         new cyn($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new apk($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dsd.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
