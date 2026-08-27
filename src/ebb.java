import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface ebb {
   ebb a = $$0 -> $$0;

   ahg<eax> lookup(ahg<eax> var1);

   static ebb create(List<eaz> $$0, hx $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         auw $$3 = auw.a($$2).e().a($$1);
         Builder<ahg<eax>, ahg<eax>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ahg<eax>, ahg<eax>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
