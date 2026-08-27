import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dkx {
   cvf b();

   static List<dkx> c() {
      return lc.h.s().map(dkx::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dkx a(czt $$0) {
      if ($$0.p() instanceof cqb $$1) {
         dcv var6 = $$1.d();
         if (var6 instanceof dkx) {
            return (dkx)var6;
         }
      }

      cry $$2 = $$0.p();
      return $$2 instanceof dkx ? (dkx)$$2 : null;
   }
}
