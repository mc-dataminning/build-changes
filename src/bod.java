import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bod(Duration a, @Nullable String b, long c) {
   public static bod.a a(Duration $$0, List<bod> $$1) {
      long $$2 = $$1.stream().mapToLong($$0x -> $$0x.c).sum();
      return new bod.a(
         $$2,
         (double)$$2 / (double)$$0.getSeconds(),
         (long)$$1.size(),
         (double)$$1.size() / (double)$$0.getSeconds(),
         $$1.stream().map(bod::a).reduce(Duration.ZERO, Duration::plus),
         $$1.stream()
            .filter($$0x -> $$0x.b != null)
            .collect(Collectors.groupingBy($$0x -> $$0x.b, Collectors.summingLong($$0x -> $$0x.c)))
            .entrySet()
            .stream()
            .sorted(Entry.<String, Long>comparingByValue().reversed())
            .map($$0x -> Pair.of((String)$$0x.getKey(), (Long)$$0x.getValue()))
            .limit(10L)
            .toList()
      );
   }

   public static record a(long a, double b, long c, double d, Duration e, List<Pair<String, Long>> f) {
   }
}
