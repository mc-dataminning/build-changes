import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dnh {
   cxd b();

   static List<dnh> c() {
      return lq.g.t().map(dnh::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dnh a(dcc $$0) {
      if ($$0.r() instanceof cry $$1) {
         dff var6 = $$1.d();
         if (var6 instanceof dnh) {
            return (dnh)var6;
         }
      }

      ctv $$2 = $$0.r();
      return $$2 instanceof dnh ? (dnh)$$2 : null;
   }
}
