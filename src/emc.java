import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface emc {
   emc a = $$0 -> $$0;

   ala<ely> lookup(ala<ely> var1);

   static emc create(List<ema> $$0, je $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azk $$3 = azk.a($$2).e().a($$1);
         Builder<ala<ely>, ala<ely>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ala<ely>, ala<ely>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
