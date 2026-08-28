import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dsr {
   daq b();

   static List<dsr> c() {
      return ma.g.s().map(dsr::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dsr a(dhh $$0) {
      if ($$0.j() instanceof cvv $$1) {
         dkm var6 = $$1.d();
         if (var6 instanceof dsr) {
            return (dsr)var6;
         }
      }

      cxl $$2 = $$0.j();
      return $$2 instanceof dsr ? (dsr)$$2 : null;
   }
}
