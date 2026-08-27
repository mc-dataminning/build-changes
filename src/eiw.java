import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface eiw {
   eiw a = $$0 -> $$0;

   akl<eis> lookup(akl<eis> var1);

   static eiw create(List<eiu> $$0, io $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         ayk $$3 = ayk.a($$2).e().a($$1);
         Builder<akl<eis>, akl<eis>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<akl<eis>, akl<eis>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
