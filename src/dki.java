import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dki {
   cur b();

   static List<dki> c() {
      return kt.h.s().map(dki::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dki a(czf $$0) {
      if ($$0.p() instanceof cpq $$1) {
         dch var6 = $$1.d();
         if (var6 instanceof dki) {
            return (dki)var6;
         }
      }

      crn $$2 = $$0.p();
      return $$2 instanceof dki ? (dki)$$2 : null;
   }
}
