import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface epq {
   epq a = $$0 -> $$0;

   aly<epm> lookup(aly<epm> var1);

   static epq create(List<epo> $$0, jh $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         bam $$3 = bam.a($$2).e().a($$1);
         Builder<aly<epm>, aly<epm>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<aly<epm>, aly<epm>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
