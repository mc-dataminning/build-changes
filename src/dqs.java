import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dqs {
   czn b();

   static List<dqs> c() {
      return lz.g.s().map(dqs::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dqs a(dfl $$0) {
      if ($$0.j() instanceof cus $$1) {
         diq var6 = $$1.d();
         if (var6 instanceof dqs) {
            return (dqs)var6;
         }
      }

      cwi $$2 = $$0.j();
      return $$2 instanceof dqs ? (dqs)$$2 : null;
   }
}
