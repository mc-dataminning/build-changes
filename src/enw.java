import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface enw {
   enw a = $$0 -> $$0;

   ali<ens> lookup(ali<ens> var1);

   static enw create(List<enu> $$0, jh $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azu $$3 = azu.a($$2).e().a($$1);
         Builder<ali<ens>, ali<ens>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ali<ens>, ali<ens>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
