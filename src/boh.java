import com.google.common.base.MoreObjects;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordedThread;

public record boh(Instant a, String b, long c) {
   private static final String d = "unknown";

   public static boh a(RecordedEvent $$0) {
      RecordedThread $$1 = $$0.getThread("thread");
      String $$2 = $$1 == null ? "unknown" : (String)MoreObjects.firstNonNull($$1.getJavaName(), "unknown");
      return new boh($$0.getStartTime(), $$2, $$0.getLong("allocated"));
   }

   public static boh.a a(List<boh> $$0) {
      Map<String, Double> $$1 = new TreeMap<>();
      Map<String, List<boh>> $$2 = $$0.stream().collect(Collectors.groupingBy($$0x -> $$0x.b));
      $$2.forEach(($$1x, $$2x) -> {
         if ($$2x.size() >= 2) {
            boh $$3 = (boh)$$2x.get(0);
            boh $$4 = (boh)$$2x.get($$2x.size() - 1);
            long $$5 = Duration.between($$3.a, $$4.a).getSeconds();
            long $$6 = $$4.c - $$3.c;
            $$1.put($$1x, (double)$$6 / (double)$$5);
         }
      });
      return new boh.a($$1);
   }

   public static record a(Map<String, Double> a) {
   }
}
