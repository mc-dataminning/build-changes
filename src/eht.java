import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface eht {
   eht a = $$0 -> $$0;

   ake<ehp> lookup(ake<ehp> var1);

   static eht create(List<ehr> $$0, im $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         ayd $$3 = ayd.a($$2).e().a($$1);
         Builder<ake<ehp>, ake<ehp>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ake<ehp>, ake<ehp>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
