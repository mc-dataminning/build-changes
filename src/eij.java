import com.mojang.serialization.Codec;

public class eij extends eje<elp> {
   public eij(Codec<elp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<elp> $$0) {
      iu $$1 = $$0.e();
      dju $$2 = $$0.b();
      azv $$3 = $$0.d();
      if ($$2.v($$1) && !$$2.v($$1.d())) {
         iu.a $$4 = $$1.k();
         iu.a $$5 = $$1.k();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.v($$4)) {
            if ($$2.t($$4)) {
               return true;
            }

            $$2.a($$4, dmc.em.m(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, ja.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, ja.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, ja.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, ja.f));
            $$4.c(ja.a);
         }

         $$4.c(ja.b);
         this.a($$2, $$3, $$5.a($$4, ja.c));
         this.a($$2, $$3, $$5.a($$4, ja.d));
         this.a($$2, $$3, $$5.a($$4, ja.e));
         this.a($$2, $$3, $$5.a($$4, ja.f));
         $$4.c(ja.a);
         iu.a $$10 = new iu.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = azm.a($$11) * azm.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.v($$5.a($$10, ja.a))) {
                     $$10.c(ja.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.v($$5.a($$10, ja.a))) {
                     $$2.a($$10, dmc.em.m(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(diw $$0, azv $$1, iu $$2) {
      if ($$1.h()) {
         $$0.a($$2, dmc.em.m(), 2);
      }
   }

   private boolean b(diw $$0, azv $$1, iu $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dmc.em.m(), 2);
         return true;
      } else {
         return false;
      }
   }
}
