import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface etb {
   etb a = $$0 -> $$0;

   alf<esx> lookup(alf<esx> var1);

   static etb create(List<esz> $$0, iv $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azv $$3 = azv.a($$2).e().a($$1);
         Builder<alf<esx>, alf<esx>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<alf<esx>, alf<esx>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x.a() + " was mapped to null value");
      }
   }
}
