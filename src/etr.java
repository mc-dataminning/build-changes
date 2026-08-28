import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface etr {
   etr a = $$0 -> $$0;

   alj<etn> lookup(alj<etn> var1);

   static etr create(List<etp> $$0, iw $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azz $$3 = azz.a($$2).e().a($$1);
         Builder<alj<etn>, alj<etn>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<alj<etn>, alj<etn>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x.a() + " was mapped to null value");
      }
   }
}
