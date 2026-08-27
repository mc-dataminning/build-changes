import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface elg {
   elg a = $$0 -> $$0;

   aks<elc> lookup(aks<elc> var1);

   static elg create(List<ele> $$0, ir $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         ayt $$3 = ayt.a($$2).e().a($$1);
         Builder<aks<elc>, aks<elc>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<aks<elc>, aks<elc>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
