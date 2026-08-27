import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface ecy {
   ecy a = $$0 -> $$0;

   aix<ecu> lookup(aix<ecu> var1);

   static ecy create(List<ecw> $$0, hz $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         awp $$3 = awp.a($$2).e().a($$1);
         Builder<aix<ecu>, aix<ecu>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<aix<ecu>, aix<ecu>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
