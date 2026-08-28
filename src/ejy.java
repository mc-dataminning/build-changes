import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface ejy {
   ejy a = $$0 -> $$0;

   ale<eju> lookup(ale<eju> var1);

   static ejy create(List<ejw> $$0, iz $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azh $$3 = azh.a($$2).e().a($$1);
         Builder<ale<eju>, ale<eju>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ale<eju>, ale<eju>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
