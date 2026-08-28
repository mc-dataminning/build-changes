import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface doy {
   cyp b();

   static List<doy> c() {
      return lu.g.s().map(doy::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static doy a(ddr $$0) {
      if ($$0.r() instanceof ctl $$1) {
         dgv var6 = $$1.d();
         if (var6 instanceof doy) {
            return (doy)var6;
         }
      }

      cvg $$2 = $$0.r();
      return $$2 instanceof doy ? (doy)$$2 : null;
   }
}
