import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface emq {
   emq a = $$0 -> $$0;

   alb<emm> lookup(alb<emm> var1);

   static emq create(List<emo> $$0, je $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azl $$3 = azl.a($$2).e().a($$1);
         Builder<alb<emm>, alb<emm>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<alb<emm>, alb<emm>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
