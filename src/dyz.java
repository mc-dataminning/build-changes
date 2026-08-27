import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface dyz {
   dyz a = $$0 -> $$0;

   agl<dyv> lookup(agl<dyv> var1);

   static dyz create(List<dyx> $$0, hx $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         atw $$3 = atw.a($$2).e().a($$1);
         Builder<agl<dyv>, agl<dyv>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<agl<dyv>, agl<dyv>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
