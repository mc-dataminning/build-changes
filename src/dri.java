import com.mojang.serialization.Codec;

public class dri extends dsc<dun> {
   public dri(Codec<dun> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dse<dun> $$0) {
      hx $$1 = $$0.e();
      cus $$2 = $$0.b();
      auw $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.c())) {
         hx.a $$4 = $$1.j();
         hx.a $$5 = $$1.j();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, cxa.dY.o(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, ic.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, ic.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, ic.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, ic.f));
            $$4.c(ic.a);
         }

         $$4.c(ic.b);
         this.a($$2, $$3, $$5.a($$4, ic.c));
         this.a($$2, $$3, $$5.a($$4, ic.d));
         this.a($$2, $$3, $$5.a($$4, ic.e));
         this.a($$2, $$3, $$5.a($$4, ic.f));
         $$4.c(ic.a);
         hx.a $$10 = new hx.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = aup.a($$11) * aup.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, ic.a))) {
                     $$10.c(ic.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, ic.a))) {
                     $$2.a($$10, cxa.dY.o(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(cty $$0, auw $$1, hx $$2) {
      if ($$1.h()) {
         $$0.a($$2, cxa.dY.o(), 2);
      }
   }

   private boolean b(cty $$0, auw $$1, hx $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, cxa.dY.o(), 2);
         return true;
      } else {
         return false;
      }
   }
}
