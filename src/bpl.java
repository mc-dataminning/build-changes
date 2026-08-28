import com.google.common.base.MoreObjects;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordedThread;

public record bpl(Instant a, String b, long c) {
   private static final String d = "unknown";

   public static bpl a(RecordedEvent $$0) {
      RecordedThread $$1 = $$0.getThread("thread");
      String $$2 = $$1 == null ? "unknown" : (String)MoreObjects.firstNonNull($$1.getJavaName(), "unknown");
      return new bpl($$0.getStartTime(), $$2, $$0.getLong("allocated"));
   }

   public static bpl.a a(List<bpl> $$0) {
      Map<String, Double> $$1 = new TreeMap<>();
      Map<String, List<bpl>> $$2 = $$0.stream().collect(Collectors.groupingBy($$0x -> $$0x.b));
      $$2.forEach(($$1x, $$2x) -> {
         if ($$2x.size() >= 2) {
            bpl $$3 = (bpl)$$2x.get(0);
            bpl $$4 = (bpl)$$2x.get($$2x.size() - 1);
            long $$5 = Duration.between($$3.a, $$4.a).getSeconds();
            long $$6 = $$4.c - $$3.c;
            $$1.put($$1x, (double)$$6 / (double)$$5);
         }
      });
      return new bpl.a($$1);
   }

   public static record a(Map<String, Double> a) {
   }
}
