import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface egu {
   egu a = $$0 -> $$0;

   ajs<egq> lookup(ajs<egq> var1);

   static egu create(List<egs> $$0, ib $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         axr $$3 = axr.a($$2).e().a($$1);
         Builder<ajs<egq>, ajs<egq>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ajs<egq>, ajs<egq>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
