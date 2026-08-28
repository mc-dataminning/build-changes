import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface epy {
   epy a = $$0 -> $$0;

   aly<epu> lookup(aly<epu> var1);

   static epy create(List<epw> $$0, jh $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         bam $$3 = bam.a($$2).e().a($$1);
         Builder<aly<epu>, aly<epu>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<aly<epu>, aly<epu>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x.a() + " was mapped to null value");
      }
   }
}
