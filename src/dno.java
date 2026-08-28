import com.mojang.serialization.MapCodec;

public abstract class dno extends dnh {
   protected dno(dsz.d $$0) {
      super($$0);
   }

   private static boolean b(dta $$0, dcx $$1, jd $$2) {
      jd $$3 = $$2.c();
      dta $$4 = $$1.a_($$3);
      if ($$4.a(dfy.dN) && $$4.c(dng.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = eop.a($$1, $$0, $$2, $$4, $$3, ji.b, $$4.b($$1, $$3));
         return $$5 < $$1.Q();
      }
   }

   @Override
   protected abstract MapCodec<? extends dno> a();

   private static boolean c(dta $$0, dcx $$1, jd $$2) {
      jd $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(awj.a);
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dfy.j.o());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            dta $$4 = this.o();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               jd $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dfy.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(dfy.dN))));
               }
            }
         }
      }
   }
}
