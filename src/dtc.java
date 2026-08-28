import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dtc {
   daw c();

   static List<dtc> d() {
      return md.g.s().map(dtc::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dtc a(dho $$0) {
      if ($$0.i() instanceof cwf $$1) {
         dku var6 = $$1.d();
         if (var6 instanceof dtc) {
            return (dtc)var6;
         }
      }

      cxu $$2 = $$0.i();
      return $$2 instanceof dtc ? (dtc)$$2 : null;
   }
}
