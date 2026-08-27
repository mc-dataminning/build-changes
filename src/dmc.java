import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dmc {
   cwu b();

   static List<dmc> c() {
      return le.h.s().map(dmc::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dmc a(day $$0) {
      if ($$0.r() instanceof cro $$1) {
         dea var6 = $$1.d();
         if (var6 instanceof dmc) {
            return (dmc)var6;
         }
      }

      ctl $$2 = $$0.r();
      return $$2 instanceof dmc ? (dmc)$$2 : null;
   }
}
