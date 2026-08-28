import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface esh {
   esh a = $$0 -> $$0;

   alf<esd> lookup(alf<esd> var1);

   static esh create(List<esf> $$0, iu $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azv $$3 = azv.a($$2).e().a($$1);
         Builder<alf<esd>, alf<esd>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<alf<esd>, alf<esd>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x.a() + " was mapped to null value");
      }
   }
}
