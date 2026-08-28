import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dna {
   cxs b();

   static List<dna> c() {
      return lp.h.s().map(dna::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dna a(dbw $$0) {
      if ($$0.r() instanceof csm $$1) {
         dey var6 = $$1.d();
         if (var6 instanceof dna) {
            return (dna)var6;
         }
      }

      cuj $$2 = $$0.r();
      return $$2 instanceof dna ? (dna)$$2 : null;
   }
}
