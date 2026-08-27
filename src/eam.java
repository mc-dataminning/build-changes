import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface eam {
   eam a = $$0 -> $$0;

   ahc<eai> lookup(ahc<eai> var1);

   static eam create(List<eak> $$0, hx $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         aup $$3 = aup.a($$2).e().a($$1);
         Builder<ahc<eai>, ahc<eai>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ahc<eai>, ahc<eai>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
