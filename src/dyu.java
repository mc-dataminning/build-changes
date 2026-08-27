import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface dyu {
   dyu a = $$0 -> $$0;

   agh<dyq> lookup(agh<dyq> var1);

   static dyu create(List<dys> $$0, ht $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         ats $$3 = ats.a($$2).e().a($$1);
         Builder<agh<dyq>, agh<dyq>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<agh<dyq>, agh<dyq>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
