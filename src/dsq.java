import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dsq {
   dap b();

   static List<dsq> c() {
      return ma.g.s().map(dsq::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dsq a(dhg $$0) {
      if ($$0.j() instanceof cvu $$1) {
         dkl var6 = $$1.d();
         if (var6 instanceof dsq) {
            return (dsq)var6;
         }
      }

      cxk $$2 = $$0.j();
      return $$2 instanceof dsq ? (dsq)$$2 : null;
   }
}
