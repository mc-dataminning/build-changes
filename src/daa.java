import javax.annotation.Nullable;

public class daa extends cxl {
   public daa(dmf $$0, cyz.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public dcw b(dcw $$0) {
      iu $$1 = $$0.a();
      dja $$2 = $$0.q();
      eah $$3 = $$2.a_($$1);
      dmf $$4 = this.c();
      if (!$$3.a($$4)) {
         return dtc.a($$2, $$1) == 7 ? null : $$0;
      } else {
         ja $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == ja.b ? $$0.g() : ja.b;
         }

         int $$7 = 0;
         iu.a $$8 = $$1.k().c($$5);

         while ($$7 < 7) {
            if (!$$2.C && !$$2.k($$8)) {
               crc $$9 = $$0.o();
               int $$10 = $$2.ao();
               if ($$9 instanceof arr && $$8.v() > $$10) {
                  ((arr)$$9).b(wy.a("build.tooHigh", $$10).a(n.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.c())) {
               if ($$3.a($$0)) {
                  return dcw.a($$0, $$8, $$5);
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
   protected boolean b() {
      return false;
   }
}
