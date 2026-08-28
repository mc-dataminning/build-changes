import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface epb {
   epb a = $$0 -> $$0;

   aku<eox> lookup(aku<eox> var1);

   static epb create(List<eoz> $$0, ji $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azh $$3 = azh.a($$2).e().a($$1);
         Builder<aku<eox>, aku<eox>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<aku<eox>, aku<eox>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x.a() + " was mapped to null value");
      }
   }
}
