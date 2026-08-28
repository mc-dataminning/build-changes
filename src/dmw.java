import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dmw {
   cxo b();

   static List<dmw> c() {
      return lp.h.s().map(dmw::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dmw a(dbs $$0) {
      if ($$0.r() instanceof csi $$1) {
         deu var6 = $$1.d();
         if (var6 instanceof dmw) {
            return (dmw)var6;
         }
      }

      cuf $$2 = $$0.r();
      return $$2 instanceof dmw ? (dmw)$$2 : null;
   }
}
