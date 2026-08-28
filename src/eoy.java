import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface eoy {
   eoy a = $$0 -> $$0;

   akt<eou> lookup(akt<eou> var1);

   static eoy create(List<eow> $$0, ji $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azg $$3 = azg.a($$2).e().a($$1);
         Builder<akt<eou>, akt<eou>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<akt<eou>, akt<eou>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x.a() + " was mapped to null value");
      }
   }
}
