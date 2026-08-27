import java.util.stream.Stream;

public class cpf {
   public static blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      $$1.c($$2);
      return blx.b($$1.b($$2));
   }

   public static cpd a(cpd $$0, chl $$1, cpd $$2, boolean $$3) {
      boolean $$4 = $$1.fU().d;
      if ($$3 && $$4) {
         if (!$$1.fT().h($$2)) {
            $$1.fT().e($$2);
         }

         return $$0;
      } else {
         if (!$$4) {
            $$0.h(1);
         }

         if ($$0.b()) {
            return $$2;
         } else {
            if (!$$1.fT().e($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cpd a(cpd $$0, chl $$1, cpd $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cdw $$0, Stream<cpd> $$1) {
      cvr $$2 = $$0.dM();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cdw($$2, $$0.dr(), $$0.dt(), $$0.dx(), $$2x)));
      }
   }
}
