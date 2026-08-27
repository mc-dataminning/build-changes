import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dnt {
   ayt e = ayt.a();
   List<ja<brf>> f = List.of(brj.d, brj.c, brj.H, brj.z, brj.A, brj.B, brj.F, brj.x);

   cxv getSuspiciousEffects();

   static List<dnt> b() {
      return lh.h.s().map(dnt::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dnt a(dbz $$0) {
      if ($$0.q() instanceof csc $$1) {
         dfc var6 = $$1.d();
         if (var6 instanceof dnt) {
            return (dnt)var6;
         }
      }

      cuc $$2 = $$0.q();
      if ($$2 instanceof dnt) {
         return (dnt)$$2;
      } else {
         return $$0.q() == cuk.vT ? () -> new cxv(List.of(new cxv.a(ad.a(f, e), e.a(60)))) : null;
      }
   }
}
