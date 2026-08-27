import java.util.stream.Stream;

public class cjj {
   public static bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      $$1.c($$2);
      return bhb.b($$1.b($$2));
   }

   public static cjh a(cjh $$0, cbw $$1, cjh $$2, boolean $$3) {
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

   public static cjh a(cjh $$0, cbw $$1, cjh $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(byp $$0, Stream<cjh> $$1) {
      cpx $$2 = $$0.dL();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new byp($$2, $$0.dq(), $$0.ds(), $$0.dw(), $$2x)));
      }
   }
}
