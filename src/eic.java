import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface eic {
   eic a = $$0 -> $$0;

   akg<ehy> lookup(akg<ehy> var1);

   static eic create(List<eia> $$0, in $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         ayg $$3 = ayg.a($$2).e().a($$1);
         Builder<akg<ehy>, akg<ehy>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<akg<ehy>, akg<ehy>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
