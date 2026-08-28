import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dnj {
   cxf b();

   static List<dnj> c() {
      return lq.g.t().map(dnj::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dnj a(dce $$0) {
      if ($$0.r() instanceof csb $$1) {
         dfh var6 = $$1.d();
         if (var6 instanceof dnj) {
            return (dnj)var6;
         }
      }

      ctx $$2 = $$0.r();
      return $$2 instanceof dnj ? (dnj)$$2 : null;
   }
}
