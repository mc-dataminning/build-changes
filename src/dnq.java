import com.mojang.serialization.MapCodec;

public abstract class dnq extends dnj {
   protected dnq(dtb.d $$0) {
      super($$0);
   }

   private static boolean b(dtc $$0, dcz $$1, jd $$2) {
      jd $$3 = $$2.d();
      dtc $$4 = $$1.a_($$3);
      if ($$4.a(dga.dN) && $$4.c(dni.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = eot.a($$1, $$0, $$2, $$4, $$3, ji.b, $$4.b($$1, $$3));
         return $$5 < $$1.Q();
      }
   }

   @Override
   protected abstract MapCodec<? extends dnq> a();

   private static boolean c(dtc $$0, dcz $$1, jd $$2) {
      jd $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(awk.a);
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dga.j.o());
      } else {
         if ($$1.A($$2.d()) >= 9) {
            dtc $$4 = this.o();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               jd $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dga.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.d()).a(dga.dN))));
               }
            }
         }
      }
   }
}
