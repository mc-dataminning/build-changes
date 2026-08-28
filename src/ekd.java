import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface ekd {
   ekd a = $$0 -> $$0;

   akj<ejz> lookup(akj<ejz> var1);

   static ekd create(List<ekb> $$0, ja $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         aym $$3 = aym.a($$2).e().a($$1);
         Builder<akj<ejz>, akj<ejz>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<akj<ejz>, akj<ejz>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
