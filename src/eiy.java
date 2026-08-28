import com.mojang.serialization.Codec;

public class eiy extends ejt<eme> {
   public eiy(Codec<eme> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejv<eme> $$0) {
      iv $$1 = $$0.e();
      dkg $$2 = $$0.b();
      azv $$3 = $$0.d();
      if ($$2.v($$1) && !$$2.v($$1.d())) {
         iv.a $$4 = $$1.k();
         iv.a $$5 = $$1.k();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.v($$4)) {
            if ($$2.t($$4)) {
               return true;
            }

            $$2.a($$4, dmo.ep.m(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, jb.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, jb.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, jb.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, jb.f));
            $$4.c(jb.a);
         }

         $$4.c(jb.b);
         this.a($$2, $$3, $$5.a($$4, jb.c));
         this.a($$2, $$3, $$5.a($$4, jb.d));
         this.a($$2, $$3, $$5.a($$4, jb.e));
         this.a($$2, $$3, $$5.a($$4, jb.f));
         $$4.c(jb.a);
         iv.a $$10 = new iv.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = azm.a($$11) * azm.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.v($$5.a($$10, jb.a))) {
                     $$10.c(jb.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.v($$5.a($$10, jb.a))) {
                     $$2.a($$10, dmo.ep.m(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(dji $$0, azv $$1, iv $$2) {
      if ($$1.h()) {
         $$0.a($$2, dmo.ep.m(), 2);
      }
   }

   private boolean b(dji $$0, azv $$1, iv $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dmo.ep.m(), 2);
         return true;
      } else {
         return false;
      }
   }
}
