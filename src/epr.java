import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface epr {
   epr a = $$0 -> $$0;

   alo<epn> lookup(alo<epn> var1);

   static epr create(List<epp> $$0, jh $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         bac $$3 = bac.a($$2).e().a($$1);
         Builder<alo<epn>, alo<epn>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<alo<epn>, alo<epn>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x.a() + " was mapped to null value");
      }
   }
}
