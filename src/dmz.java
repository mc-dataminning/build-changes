import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dmz {
   cxr b();

   static List<dmz> c() {
      return lp.h.s().map(dmz::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dmz a(dbv $$0) {
      if ($$0.r() instanceof csl $$1) {
         dex var6 = $$1.d();
         if (var6 instanceof dmz) {
            return (dmz)var6;
         }
      }

      cui $$2 = $$0.r();
      return $$2 instanceof dmz ? (dmz)$$2 : null;
   }
}
