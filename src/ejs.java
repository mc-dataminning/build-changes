import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface ejs {
   ejs a = $$0 -> $$0;

   ala<ejo> lookup(ala<ejo> var1);

   static ejs create(List<ejq> $$0, iz $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azc $$3 = azc.a($$2).e().a($$1);
         Builder<ala<ejo>, ala<ejo>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ala<ejo>, ala<ejo>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
