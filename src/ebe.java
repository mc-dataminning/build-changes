import com.mojang.serialization.Codec;

public class ebe extends eca<eer> {
   public ebe(Codec<eer> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eer> $$0) {
      ir $$1 = $$0.e();
      dcv $$2 = $$0.b();
      ayt $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.c())) {
         ir.a $$4 = $$1.j();
         ir.a $$5 = $$1.j();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, dfe.eM.n(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, iw.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, iw.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, iw.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, iw.f));
            $$4.d(iw.a);
         }

         $$4.d(iw.b);
         this.a($$2, $$3, $$5.a($$4, iw.c));
         this.a($$2, $$3, $$5.a($$4, iw.d));
         this.a($$2, $$3, $$5.a($$4, iw.e));
         this.a($$2, $$3, $$5.a($$4, iw.f));
         $$4.d(iw.a);
         ir.a $$10 = new ir.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = aym.a($$11) * aym.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, iw.a))) {
                     $$10.d(iw.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, iw.a))) {
                     $$2.a($$10, dfe.eM.n(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(dcb $$0, ayt $$1, ir $$2) {
      if ($$1.h()) {
         $$0.a($$2, dfe.eM.n(), 2);
      }
   }

   private boolean b(dcb $$0, ayt $$1, ir $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dfe.eM.n(), 2);
         return true;
      } else {
         return false;
      }
   }
}
