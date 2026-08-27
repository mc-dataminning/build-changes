import com.mojang.serialization.Codec;

public class dmx extends dnr<dqc> {
   public dmx(Codec<dqc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dqc> $$0) {
      gw $$1 = $$0.e();
      cqk $$2 = $$0.b();
      arx $$3 = $$0.d();
      if ($$2.t($$1) && !$$2.t($$1.c())) {
         gw.a $$4 = $$1.j();
         gw.a $$5 = $$1.j();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.t($$4)) {
            if ($$2.r($$4)) {
               return true;
            }

            $$2.a($$4, csr.dZ.n(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, hc.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, hc.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, hc.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, hc.f));
            $$4.c(hc.a);
         }

         $$4.c(hc.b);
         this.a($$2, $$3, $$5.a($$4, hc.c));
         this.a($$2, $$3, $$5.a($$4, hc.d));
         this.a($$2, $$3, $$5.a($$4, hc.e));
         this.a($$2, $$3, $$5.a($$4, hc.f));
         $$4.c(hc.a);
         gw.a $$10 = new gw.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = ars.a($$11) * ars.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.t($$5.a($$10, hc.a))) {
                     $$10.c(hc.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.t($$5.a($$10, hc.a))) {
                     $$2.a($$10, csr.dZ.n(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(cpr $$0, arx $$1, gw $$2) {
      if ($$1.h()) {
         $$0.a($$2, csr.dZ.n(), 2);
      }
   }

   private boolean b(cpr $$0, arx $$1, gw $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, csr.dZ.n(), 2);
         return true;
      } else {
         return false;
      }
   }
}
