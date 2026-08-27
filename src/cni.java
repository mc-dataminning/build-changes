import java.util.stream.Stream;

public class cni {
   public static bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      $$1.c($$2);
      return bkd.b($$1.b($$2));
   }

   public static cng a(cng $$0, cfq $$1, cng $$2, boolean $$3) {
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

   public static cng a(cng $$0, cfq $$1, cng $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(ccb $$0, Stream<cng> $$1) {
      ctx $$2 = $$0.dL();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new ccb($$2, $$0.dq(), $$0.ds(), $$0.dw(), $$2x)));
      }
   }
}
