import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dnd {
   cxv b();

   static List<dnd> c() {
      return lp.h.s().map(dnd::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dnd a(dbz $$0) {
      if ($$0.r() instanceof csp $$1) {
         dfb var6 = $$1.d();
         if (var6 instanceof dnd) {
            return (dnd)var6;
         }
      }

      cum $$2 = $$0.r();
      return $$2 instanceof dnd ? (dnd)$$2 : null;
   }
}
