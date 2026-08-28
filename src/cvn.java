public class cvn {
   public static brk a(dds $$0, cnp $$1, brj $$2) {
      $$1.c($$2);
      return brk.c;
   }

   public static cvl a(cvl $$0, cnp $$1, cvl $$2, boolean $$3) {
      boolean $$4 = $$1.fP();
      if ($$3 && $$4) {
         if (!$$1.gc().i($$2)) {
            $$1.gc().f($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.f()) {
            return $$2;
         } else {
            if (!$$1.gc().f($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cvl a(cvl $$0, cnp $$1, cvl $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cjz $$0, Iterable<cvl> $$1) {
      dds $$2 = $$0.dS();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cjz($$2, $$0.dx(), $$0.dz(), $$0.dD(), $$2x)));
      }
   }
}
