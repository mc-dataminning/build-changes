import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface edt {
   edt a = $$0 -> $$0;

   ajb<edp> lookup(ajb<edp> var1);

   static edt create(List<edr> $$0, ib $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         awt $$3 = awt.a($$2).e().a($$1);
         Builder<ajb<edp>, ajb<edp>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ajb<edp>, ajb<edp>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
