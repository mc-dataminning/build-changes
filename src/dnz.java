import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dnz {
   cxu b();

   static List<dnz> c() {
      return lt.g.t().map(dnz::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dnz a(dct $$0) {
      if ($$0.r() instanceof csm $$1) {
         dfw var6 = $$1.d();
         if (var6 instanceof dnz) {
            return (dnz)var6;
         }
      }

      cuj $$2 = $$0.r();
      return $$2 instanceof dnz ? (dnz)$$2 : null;
   }
}
