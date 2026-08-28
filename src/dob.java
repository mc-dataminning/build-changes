import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dob {
   cxw b();

   static List<dob> c() {
      return lt.g.t().map(dob::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dob a(dcv $$0) {
      if ($$0.r() instanceof cso $$1) {
         dfy var6 = $$1.d();
         if (var6 instanceof dob) {
            return (dob)var6;
         }
      }

      cul $$2 = $$0.r();
      return $$2 instanceof dob ? (dob)$$2 : null;
   }
}
