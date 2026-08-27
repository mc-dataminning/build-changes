import java.util.stream.Stream;

public class csf {
   public static bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      $$1.c($$2);
      return bor.b($$1.b($$2));
   }

   public static csd a(csd $$0, ckl $$1, csd $$2, boolean $$3) {
      boolean $$4 = $$1.fN();
      if ($$3 && $$4) {
         if (!$$1.ga().h($$2)) {
            $$1.ga().e($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.d()) {
            return $$2;
         } else {
            if (!$$1.ga().e($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static csd a(csd $$0, ckl $$1, csd $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cgv $$0, Stream<csd> $$1) {
      czu $$2 = $$0.dN();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cgv($$2, $$0.ds(), $$0.du(), $$0.dy(), $$2x)));
      }
   }
}
