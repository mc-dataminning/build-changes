import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface ejz {
   ejz a = $$0 -> $$0;

   ale<ejv> lookup(ale<ejv> var1);

   static ejz create(List<ejx> $$0, iz $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azh $$3 = azh.a($$2).e().a($$1);
         Builder<ale<ejv>, ale<ejv>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ale<ejv>, ale<ejv>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
