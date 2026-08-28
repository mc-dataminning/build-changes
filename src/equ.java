import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface equ {
   equ a = $$0 -> $$0;

   alc<eqq> lookup(alc<eqq> var1);

   static equ create(List<eqs> $$0, jj $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azs $$3 = azs.a($$2).e().a($$1);
         Builder<alc<eqq>, alc<eqq>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<alc<eqq>, alc<eqq>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x.a() + " was mapped to null value");
      }
   }
}
