import com.mojang.serialization.Codec;

public class edu extends eep<eha> {
   public edu(Codec<eha> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eer<eha> $$0) {
      jh $$1 = $$0.e();
      dgd $$2 = $$0.b();
      azv $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.d())) {
         jh.a $$4 = $$1.k();
         jh.a $$5 = $$1.k();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, dil.dY.m(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, jm.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, jm.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, jm.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, jm.f));
            $$4.c(jm.a);
         }

         $$4.c(jm.b);
         this.a($$2, $$3, $$5.a($$4, jm.c));
         this.a($$2, $$3, $$5.a($$4, jm.d));
         this.a($$2, $$3, $$5.a($$4, jm.e));
         this.a($$2, $$3, $$5.a($$4, jm.f));
         $$4.c(jm.a);
         jh.a $$10 = new jh.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = azn.a($$11) * azn.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, jm.a))) {
                     $$10.c(jm.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, jm.a))) {
                     $$2.a($$10, dil.dY.m(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(dfg $$0, azv $$1, jh $$2) {
      if ($$1.h()) {
         $$0.a($$2, dil.dY.m(), 2);
      }
   }

   private boolean b(dfg $$0, azv $$1, jh $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dil.dY.m(), 2);
         return true;
      } else {
         return false;
      }
   }
}
