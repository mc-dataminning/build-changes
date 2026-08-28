import com.mojang.serialization.Codec;

public class dzz extends eat<ede> {
   public dzz(Codec<ede> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eav<ede> $$0) {
      iz $$1 = $$0.e();
      dco $$2 = $$0.b();
      azc $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.c())) {
         iz.a $$4 = $$1.j();
         iz.a $$5 = $$1.j();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, dew.dY.n(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, je.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, je.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, je.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, je.f));
            $$4.c(je.a);
         }

         $$4.c(je.b);
         this.a($$2, $$3, $$5.a($$4, je.c));
         this.a($$2, $$3, $$5.a($$4, je.d));
         this.a($$2, $$3, $$5.a($$4, je.e));
         this.a($$2, $$3, $$5.a($$4, je.f));
         $$4.c(je.a);
         iz.a $$10 = new iz.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = ayu.a($$11) * ayu.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, je.a))) {
                     $$10.c(je.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, je.a))) {
                     $$2.a($$10, dew.dY.n(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(dbu $$0, azc $$1, iz $$2) {
      if ($$1.h()) {
         $$0.a($$2, dew.dY.n(), 2);
      }
   }

   private boolean b(dbu $$0, azc $$1, iz $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dew.dY.n(), 2);
         return true;
      } else {
         return false;
      }
   }
}
