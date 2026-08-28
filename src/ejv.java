import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface ejv {
   ejv a = $$0 -> $$0;

   ald<ejr> lookup(ald<ejr> var1);

   static ejv create(List<ejt> $$0, iz $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azf $$3 = azf.a($$2).e().a($$1);
         Builder<ald<ejr>, ald<ejr>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ald<ejr>, ald<ejr>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
