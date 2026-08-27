import com.mojang.serialization.MapCodec;

public abstract class dkm extends dkf {
   protected dkm(dpx.d $$0) {
      super($$0);
   }

   private static boolean b(dpy $$0, czx $$1, im $$2) {
      im $$3 = $$2.c();
      dpy $$4 = $$1.a_($$3);
      if ($$4.a(dcx.dN) && $$4.c(dke.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = eli.a($$1, $$0, $$2, $$4, $$3, ir.b, $$4.b($$1, $$3));
         return $$5 < $$1.P();
      }
   }

   @Override
   protected abstract MapCodec<? extends dkm> a();

   private static boolean c(dpy $$0, czx $$1, im $$2) {
      im $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(avt.a);
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dcx.j.n());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            dpy $$4 = this.n();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               im $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dcx.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(dcx.dN))));
               }
            }
         }
      }
   }
}
