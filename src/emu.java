import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface emu {
   emu a = $$0 -> $$0;

   ald<emq> lookup(ald<emq> var1);

   static emu create(List<ems> $$0, jf $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azn $$3 = azn.a($$2).e().a($$1);
         Builder<ald<emq>, ald<emq>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<ald<emq>, ald<emq>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
