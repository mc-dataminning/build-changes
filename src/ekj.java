import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface ekj {
   ekj a = $$0 -> $$0;

   akj<ekf> lookup(akj<ekf> var1);

   static ekj create(List<ekh> $$0, ja $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         ayo $$3 = ayo.a($$2).e().a($$1);
         Builder<akj<ekf>, akj<ekf>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<akj<ekf>, akj<ekf>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
