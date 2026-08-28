import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dsk {
   dah c();

   static List<dsk> d() {
      return ma.g.s().map(dsk::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dsk a(dgy $$0) {
      if ($$0.j() instanceof cvm $$1) {
         dkd var6 = $$1.d();
         if (var6 instanceof dsk) {
            return (dsk)var6;
         }
      }

      cxc $$2 = $$0.j();
      return $$2 instanceof dsk ? (dsk)$$2 : null;
   }
}
