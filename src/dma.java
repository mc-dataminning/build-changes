import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dma {
   cws b();

   static List<dma> c() {
      return le.h.s().map(dma::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dma a(daw $$0) {
      if ($$0.q() instanceof crm $$1) {
         ddy var6 = $$1.d();
         if (var6 instanceof dma) {
            return (dma)var6;
         }
      }

      ctj $$2 = $$0.q();
      return $$2 instanceof dma ? (dma)$$2 : null;
   }
}
