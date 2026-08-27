import com.mojang.serialization.Codec;

public class dnu extends doo<dqz> {
   public dnu(Codec<dqz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doq<dqz> $$0) {
      ht $$1 = $$0.e();
      crt $$2 = $$0.b();
      ate $$3 = $$0.d();
      if ($$2.t($$1) && !$$2.t($$1.c())) {
         ht.a $$4 = $$1.j();
         ht.a $$5 = $$1.j();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.t($$4)) {
            if ($$2.r($$4)) {
               return true;
            }

            $$2.a($$4, cuc.dY.o(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, hx.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, hx.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, hx.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, hx.f));
            $$4.c(hx.a);
         }

         $$4.c(hx.b);
         this.a($$2, $$3, $$5.a($$4, hx.c));
         this.a($$2, $$3, $$5.a($$4, hx.d));
         this.a($$2, $$3, $$5.a($$4, hx.e));
         this.a($$2, $$3, $$5.a($$4, hx.f));
         $$4.c(hx.a);
         ht.a $$10 = new ht.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = asy.a($$11) * asy.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.t($$5.a($$10, hx.a))) {
                     $$10.c(hx.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.t($$5.a($$10, hx.a))) {
                     $$2.a($$10, cuc.dY.o(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(cra $$0, ate $$1, ht $$2) {
      if ($$1.h()) {
         $$0.a($$2, cuc.dY.o(), 2);
      }
   }

   private boolean b(cra $$0, ate $$1, ht $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, cuc.dY.o(), 2);
         return true;
      } else {
         return false;
      }
   }
}
