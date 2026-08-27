import javax.annotation.Nullable;

public class cun extends cro {
   public cun(dea $$0, ctl.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public cxb b(cxb $$0) {
      io $$1 = $$0.a();
      daz $$2 = $$0.q();
      drd $$3 = $$2.a_($$1);
      dea $$4 = this.d();
      if (!$$3.a($$4)) {
         return dkp.a($$2, $$1) == 7 ? null : $$0;
      } else {
         it $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == it.b ? $$0.g() : it.b;
         }

         int $$7 = 0;
         io.a $$8 = $$1.j().c($$5);

         while ($$7 < 7) {
            if (!$$2.B && !$$2.k($$8)) {
               cly $$9 = $$0.o();
               int $$10 = $$2.al();
               if ($$9 instanceof aqo && $$8.v() >= $$10) {
                  ((aqo)$$9).b(wx.a("build.tooHigh", $$10 - 1).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.d())) {
               if ($$3.a($$0)) {
                  return cxb.a($$0, $$8, $$5);
               }
               break;
            }

            $$8.c($$5);
            if ($$5.o().d()) {
               $$7++;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean c() {
      return false;
   }
}
