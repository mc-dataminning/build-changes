import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface erw {
   erw a = $$0 -> $$0;

   ald<ers> lookup(ald<ers> var1);

   static erw create(List<eru> $$0, iu $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azt $$3 = azt.a($$2).e().a($$1);
         Builder<ald<ers>, ald<ers>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ald<ers>, ald<ers>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x.a() + " was mapped to null value");
      }
   }
}
