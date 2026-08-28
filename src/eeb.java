import com.mojang.serialization.Codec;

public class eeb extends eew<ehh> {
   public eeb(Codec<ehh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eey<ehh> $$0) {
      jh $$1 = $$0.e();
      dgk $$2 = $$0.b();
      azu $$3 = $$0.d();
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

            $$2.a($$4, dis.dY.m(), 2);
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
               int $$13 = azm.a($$11) * azm.a($$12);
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
                     $$2.a($$10, dis.dY.m(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(dfn $$0, azu $$1, jh $$2) {
      if ($$1.h()) {
         $$0.a($$2, dis.dY.m(), 2);
      }
   }

   private boolean b(dfn $$0, azu $$1, jh $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dis.dY.m(), 2);
         return true;
      } else {
         return false;
      }
   }
}
