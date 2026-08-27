import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface ehd {
   ehd a = $$0 -> $$0;

   aju<egz> lookup(aju<egz> var1);

   static ehd create(List<ehb> $$0, id $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         axt $$3 = axt.a($$2).e().a($$1);
         Builder<aju<egz>, aju<egz>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<aju<egz>, aju<egz>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
