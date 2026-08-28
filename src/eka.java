import com.mojang.serialization.Codec;

public class eka extends ekw<eni> {
   public eka(Codec<eni> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<eni> $$0) {
      iw $$1 = $$0.e();
      dli $$2 = $$0.b();
      bai $$3 = $$0.d();
      if ($$2.v($$1) && !$$2.v($$1.d())) {
         iw.a $$4 = $$1.k();
         iw.a $$5 = $$1.k();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.v($$4)) {
            if ($$2.t($$4)) {
               return true;
            }

            $$2.a($$4, dnq.ep.m(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, jc.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, jc.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, jc.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, jc.f));
            $$4.c(jc.a);
         }

         $$4.c(jc.b);
         this.a($$2, $$3, $$5.a($$4, jc.c));
         this.a($$2, $$3, $$5.a($$4, jc.d));
         this.a($$2, $$3, $$5.a($$4, jc.e));
         this.a($$2, $$3, $$5.a($$4, jc.f));
         $$4.c(jc.a);
         iw.a $$10 = new iw.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = azz.a($$11) * azz.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.v($$5.a($$10, jc.a))) {
                     $$10.c(jc.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.v($$5.a($$10, jc.a))) {
                     $$2.a($$10, dnq.ep.m(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(dkk $$0, bai $$1, iw $$2) {
      if ($$1.h()) {
         $$0.a($$2, dnq.ep.m(), 2);
      }
   }

   private boolean b(dkk $$0, bai $$1, iw $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dnq.ep.m(), 2);
         return true;
      } else {
         return false;
      }
   }
}
