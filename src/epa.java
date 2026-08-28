import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface epa {
   epa a = $$0 -> $$0;

   akt<eow> lookup(akt<eow> var1);

   static epa create(List<eoy> $$0, ji $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azh $$3 = azh.a($$2).e().a($$1);
         Builder<akt<eow>, akt<eow>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<akt<eow>, akt<eow>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x.a() + " was mapped to null value");
      }
   }
}
