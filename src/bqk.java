import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bqk(Duration a, dgg b, art c, eaj d, String e) implements bqt {
   public static bqk a(RecordedEvent $$0) {
      return new bqk(
         $$0.getDuration(),
         new dgg($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new art($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         eaj.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
