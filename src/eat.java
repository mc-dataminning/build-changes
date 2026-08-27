import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface eat {
   eat a = $$0 -> $$0;

   ahf<eap> lookup(ahf<eap> var1);

   static eat create(List<ear> $$0, hx $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         auv $$3 = auv.a($$2).e().a($$1);
         Builder<ahf<eap>, ahf<eap>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ahf<eap>, ahf<eap>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
