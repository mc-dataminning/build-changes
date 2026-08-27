import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public record bns<T extends bnr>(T a, T b, @Nullable T c, int d, Map<Integer, Double> e, Duration f) {
   public static <T extends bnr> bns<T> a(List<T> $$0) {
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("No values");
      } else {
         List<T> $$1 = $$0.stream().sorted(Comparator.comparing(bnr::a)).toList();
         Duration $$2 = $$1.stream().map(bnr::a).reduce(Duration::plus).orElse(Duration.ZERO);
         T $$3 = (T)$$1.get(0);
         T $$4 = (T)$$1.get($$1.size() - 1);
         T $$5 = $$1.size() > 1 ? $$1.get($$1.size() - 2) : null;
         int $$6 = $$1.size();
         Map<Integer, Double> $$7 = bmv.a($$1.stream().mapToLong($$0x -> $$0x.a().toNanos()).toArray());
         return new bns<>($$3, $$4, $$5, $$6, $$7, $$2);
      }
   }
}
