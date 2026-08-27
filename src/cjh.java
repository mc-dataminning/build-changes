import java.util.stream.Stream;

public class cjh {
   public static bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      $$1.c($$2);
      return bgz.b($$1.b($$2));
   }

   public static cjf a(cjf $$0, cbu $$1, cjf $$2, boolean $$3) {
      boolean $$4 = $$1.fS().d;
      if ($$3 && $$4) {
         if (!$$1.fR().h($$2)) {
            $$1.fR().e($$2);
         }

         return $$0;
      } else {
         if (!$$4) {
            $$0.h(1);
         }

         if ($$0.b()) {
            return $$2;
         } else {
            if (!$$1.fR().e($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cjf a(cjf $$0, cbu $$1, cjf $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(byn $$0, Stream<cjf> $$1) {
      cpv $$2 = $$0.dL();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new byn($$2, $$0.dq(), $$0.ds(), $$0.dw(), $$2x)));
      }
   }
}
