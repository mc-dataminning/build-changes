import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface eas {
   eas a = $$0 -> $$0;

   ahf<eao> lookup(ahf<eao> var1);

   static eas create(List<eaq> $$0, hx $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         auu $$3 = auu.a($$2).e().a($$1);
         Builder<ahf<eao>, ahf<eao>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ahf<eao>, ahf<eao>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
