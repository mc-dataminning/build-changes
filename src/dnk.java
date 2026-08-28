import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dnk {
   cxg b();

   static List<dnk> c() {
      return lq.g.t().map(dnk::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dnk a(dcf $$0) {
      if ($$0.r() instanceof csc $$1) {
         dfi var6 = $$1.d();
         if (var6 instanceof dnk) {
            return (dnk)var6;
         }
      }

      cty $$2 = $$0.r();
      return $$2 instanceof dnk ? (dnk)$$2 : null;
   }
}
