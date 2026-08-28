import com.mojang.serialization.Codec;

public class ecz extends edu<egf> {
   public ecz(Codec<egf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egf> $$0) {
      jf $$1 = $$0.e();
      dfg $$2 = $$0.b();
      azn $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.d())) {
         jf.a $$4 = $$1.k();
         jf.a $$5 = $$1.k();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, dho.dY.n(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, jk.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, jk.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, jk.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, jk.f));
            $$4.c(jk.a);
         }

         $$4.c(jk.b);
         this.a($$2, $$3, $$5.a($$4, jk.c));
         this.a($$2, $$3, $$5.a($$4, jk.d));
         this.a($$2, $$3, $$5.a($$4, jk.e));
         this.a($$2, $$3, $$5.a($$4, jk.f));
         $$4.c(jk.a);
         jf.a $$10 = new jf.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = azf.a($$11) * azf.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, jk.a))) {
                     $$10.c(jk.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, jk.a))) {
                     $$2.a($$10, dho.dY.n(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(dek $$0, azn $$1, jf $$2) {
      if ($$1.h()) {
         $$0.a($$2, dho.dY.n(), 2);
      }
   }

   private boolean b(dek $$0, azn $$1, jf $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dho.dY.n(), 2);
         return true;
      } else {
         return false;
      }
   }
}
