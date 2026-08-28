import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dql {
   czg b();

   static List<dql> c() {
      return lz.g.s().map(dql::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dql a(dfe $$0) {
      if ($$0.j() instanceof cul $$1) {
         dij var6 = $$1.d();
         if (var6 instanceof dql) {
            return (dql)var6;
         }
      }

      cwb $$2 = $$0.j();
      return $$2 instanceof dql ? (dql)$$2 : null;
   }
}
