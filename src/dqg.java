import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dqg {
   czc b();

   static List<dqg> c() {
      return ly.g.s().map(dqg::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dqg a(dfa $$0) {
      if ($$0.j() instanceof cuh $$1) {
         die var6 = $$1.d();
         if (var6 instanceof dqg) {
            return (dqg)var6;
         }
      }

      cvx $$2 = $$0.j();
      return $$2 instanceof dqg ? (dqg)$$2 : null;
   }
}
