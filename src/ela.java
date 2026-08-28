import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface ela {
   ela a = $$0 -> $$0;

   akp<ekw> lookup(akp<ekw> var1);

   static ela create(List<eky> $$0, jd $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         ayv $$3 = ayv.a($$2).e().a($$1);
         Builder<akp<ekw>, akp<ekw>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<akp<ekw>, akp<ekw>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
