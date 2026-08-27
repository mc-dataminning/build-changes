import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record bfl(Duration a, cqg b, alg c, dic d, String e) implements bfs {
   public static bfl a(RecordedEvent $$0) {
      return new bfl(
         $$0.getDuration(),
         new cqg($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new alg($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         dic.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
