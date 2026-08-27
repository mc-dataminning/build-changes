import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface eab {
   eab a = $$0 -> $$0;

   ags<dzx> lookup(ags<dzx> var1);

   static eab create(List<dzz> $$0, hv $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         auf $$3 = auf.a($$2).e().a($$1);
         Builder<ags<dzx>, ags<dzx>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ags<dzx>, ags<dzx>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
