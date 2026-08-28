import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface drt {
   czq c();

   static List<drt> d() {
      return mb.g.s().map(drt::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static drt a(dgh $$0) {
      if ($$0.j() instanceof cuv $$1) {
         djm var6 = $$1.d();
         if (var6 instanceof drt) {
            return (drt)var6;
         }
      }

      cwl $$2 = $$0.j();
      return $$2 instanceof drt ? (drt)$$2 : null;
   }
}
