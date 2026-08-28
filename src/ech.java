import com.mojang.serialization.Codec;

public class ech extends edc<efn> {
   public ech(Codec<efn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<efn> $$0) {
      je $$1 = $$0.e();
      dep $$2 = $$0.b();
      azk $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.d())) {
         je.a $$4 = $$1.k();
         je.a $$5 = $$1.k();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, dgx.dY.o(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, jj.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, jj.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, jj.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, jj.f));
            $$4.c(jj.a);
         }

         $$4.c(jj.b);
         this.a($$2, $$3, $$5.a($$4, jj.c));
         this.a($$2, $$3, $$5.a($$4, jj.d));
         this.a($$2, $$3, $$5.a($$4, jj.e));
         this.a($$2, $$3, $$5.a($$4, jj.f));
         $$4.c(jj.a);
         je.a $$10 = new je.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = azc.a($$11) * azc.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, jj.a))) {
                     $$10.c(jj.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, jj.a))) {
                     $$2.a($$10, dgx.dY.o(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(ddt $$0, azk $$1, je $$2) {
      if ($$1.h()) {
         $$0.a($$2, dgx.dY.o(), 2);
      }
   }

   private boolean b(ddt $$0, azk $$1, je $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dgx.dY.o(), 2);
         return true;
      } else {
         return false;
      }
   }
}
