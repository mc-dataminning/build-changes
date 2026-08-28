import com.mojang.serialization.Codec;

public class eaq extends ebk<edv> {
   public eaq(Codec<edv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebm<edv> $$0) {
      ja $$1 = $$0.e();
      ddb $$2 = $$0.b();
      ayo $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.c())) {
         ja.a $$4 = $$1.j();
         ja.a $$5 = $$1.j();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, dfj.dY.o(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, jf.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, jf.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, jf.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, jf.f));
            $$4.c(jf.a);
         }

         $$4.c(jf.b);
         this.a($$2, $$3, $$5.a($$4, jf.c));
         this.a($$2, $$3, $$5.a($$4, jf.d));
         this.a($$2, $$3, $$5.a($$4, jf.e));
         this.a($$2, $$3, $$5.a($$4, jf.f));
         $$4.c(jf.a);
         ja.a $$10 = new ja.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = ayg.a($$11) * ayg.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, jf.a))) {
                     $$10.c(jf.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, jf.a))) {
                     $$2.a($$10, dfj.dY.o(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(dcg $$0, ayo $$1, ja $$2) {
      if ($$1.h()) {
         $$0.a($$2, dfj.dY.o(), 2);
      }
   }

   private boolean b(dcg $$0, ayo $$1, ja $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dfj.dY.o(), 2);
         return true;
      } else {
         return false;
      }
   }
}
