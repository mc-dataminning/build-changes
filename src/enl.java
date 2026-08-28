import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface enl {
   enl a = $$0 -> $$0;

   alh<enh> lookup(alh<enh> var1);

   static enl create(List<enj> $$0, jh $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azs $$3 = azs.a($$2).e().a($$1);
         Builder<alh<enh>, alh<enh>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<alh<enh>, alh<enh>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
