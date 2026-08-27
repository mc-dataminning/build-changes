import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface eep {
   eep a = $$0 -> $$0;

   ajg<eel> lookup(ajg<eel> var1);

   static eep create(List<een> $$0, ib $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         axd $$3 = axd.a($$2).e().a($$1);
         Builder<ajg<eel>, ajg<eel>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ajg<eel>, ajg<eel>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
