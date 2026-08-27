import java.util.stream.Stream;

public class cna {
   public static bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      $$1.c($$2);
      return bkc.b($$1.b($$2));
   }

   public static cmy a(cmy $$0, cfi $$1, cmy $$2, boolean $$3) {
      boolean $$4 = $$1.fT().d;
      if ($$3 && $$4) {
         if (!$$1.fS().h($$2)) {
            $$1.fS().e($$2);
         }

         return $$0;
      } else {
         if (!$$4) {
            $$0.h(1);
         }

         if ($$0.b()) {
            return $$2;
         } else {
            if (!$$1.fS().e($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cmy a(cmy $$0, cfi $$1, cmy $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cbu $$0, Stream<cmy> $$1) {
      ctp $$2 = $$0.dM();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cbu($$2, $$0.dr(), $$0.dt(), $$0.dx(), $$2x)));
      }
   }
}
