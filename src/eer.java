import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface eer {
   eer a = $$0 -> $$0;

   ajg<een> lookup(ajg<een> var1);

   static eer create(List<eep> $$0, ib $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         axd $$3 = axd.a($$2).e().a($$1);
         Builder<ajg<een>, ajg<een>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ajg<een>, ajg<een>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
