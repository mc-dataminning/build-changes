import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dnb {
   cxt b();

   static List<dnb> c() {
      return lp.h.s().map(dnb::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dnb a(dbx $$0) {
      if ($$0.r() instanceof csn $$1) {
         dez var6 = $$1.d();
         if (var6 instanceof dnb) {
            return (dnb)var6;
         }
      }

      cuk $$2 = $$0.r();
      return $$2 instanceof dnb ? (dnb)$$2 : null;
   }
}
