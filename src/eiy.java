import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface eiy {
   eiy a = $$0 -> $$0;

   akm<eiu> lookup(akm<eiu> var1);

   static eiy create(List<eiw> $$0, io $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         aym $$3 = aym.a($$2).e().a($$1);
         Builder<akm<eiu>, akm<eiu>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<akm<eiu>, akm<eiu>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x + " was mapped to null value");
      }
   }
}
