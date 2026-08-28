import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dnc {
   cxu b();

   static List<dnc> c() {
      return lp.h.s().map(dnc::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dnc a(dby $$0) {
      if ($$0.r() instanceof cso $$1) {
         dfa var6 = $$1.d();
         if (var6 instanceof dnc) {
            return (dnc)var6;
         }
      }

      cul $$2 = $$0.r();
      return $$2 instanceof dnc ? (dnc)$$2 : null;
   }
}
