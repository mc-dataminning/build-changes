import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dsm {
   dag c();

   static List<dsm> d() {
      return mb.g.s().map(dsm::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dsm a(dgy $$0) {
      if ($$0.i() instanceof cvo $$1) {
         dke var6 = $$1.d();
         if (var6 instanceof dsm) {
            return (dsm)var6;
         }
      }

      cxd $$2 = $$0.i();
      return $$2 instanceof dsm ? (dsm)$$2 : null;
   }
}
