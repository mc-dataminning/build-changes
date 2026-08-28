public class cvv {
   public static brs a(dej $$0, cnx $$1, brr $$2) {
      $$1.c($$2);
      return brs.c;
   }

   public static cvs a(cvs $$0, cnx $$1, cvs $$2, boolean $$3) {
      boolean $$4 = $$1.fR();
      if ($$3 && $$4) {
         if (!$$1.gd().i($$2)) {
            $$1.gd().f($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.f()) {
            return $$2;
         } else {
            if (!$$1.gd().f($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cvs a(cvs $$0, cnx $$1, cvs $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(ckh $$0, Iterable<cvs> $$1) {
      dej $$2 = $$0.dS();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new ckh($$2, $$0.dx(), $$0.dz(), $$0.dD(), $$2x)));
      }
   }
}
