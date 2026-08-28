import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface eub {
   eub a = $$0 -> $$0;

   alq<etx> lookup(alq<etx> var1);

   static eub create(List<etz> $$0, iw $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         bai $$3 = bai.a($$2).e().a($$1);
         Builder<alq<etx>, alq<etx>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<alq<etx>, alq<etx>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x.a() + " was mapped to null value");
      }
   }
}
