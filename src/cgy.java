import java.util.function.Predicate;

public class cgy extends cjq implements cku {
   public static final int a = 20;
   public static final int b = 15;

   public cgy(civ.a $$0) {
      super($$0);
   }

   @Override
   public void a(cja $$0, cpq $$1, bjb $$2, int $$3) {
      if ($$2 instanceof cbp $$4) {
         boolean $$5 = $$4.fR().d || cnl.a(cnn.B, $$0) > 0;
         cja $$6 = $$4.g($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new cja(cjd.nH);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(cjd.nH);
               if (!$$1.B) {
                  cgo $$10 = (cgo)($$6.d() instanceof cgo ? $$6.d() : cjd.nH);
                  cbv $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.dC(), $$4.dA(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = cnl.a(cnn.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.q() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = cnl.a(cnn.z, $$0);
                  if ($$13 > 0) {
                     $$11.b($$13);
                  }

                  if (cnl.a(cnn.A, $$0) > 0) {
                     $$11.g(100);
                  }

                  $$0.a(1, $$4, $$1x -> $$1x.d($$4.fm()));
                  if ($$9 || $$4.fR().d && ($$6.a(cjd.uv) || $$6.a(cjd.uw))) {
                     $$11.d = cbv.a.c;
                  }

                  $$1.b($$11);
               }

               $$1.a(null, $$4.dp(), $$4.dr(), $$4.dv(), aoz.ar, apa.h, 1.0F, 1.0F / ($$1.y_().i() * 0.4F + 1.2F) + $$8 * 0.5F);
               if (!$$9 && !$$4.fR().d) {
                  $$6.h(1);
                  if ($$6.b()) {
                     $$4.fQ().g($$6);
                  }
               }

               $$4.b(apj.c.b(this));
            }
         }
      }
   }

   public static float a(int $$0) {
      float $$1 = (float)$$0 / 20.0F;
      $$1 = ($$1 * $$1 + $$1 * 2.0F) / 3.0F;
      if ($$1 > 1.0F) {
         $$1 = 1.0F;
      }

      return $$1;
   }

   @Override
   public int b(cja $$0) {
      return 72000;
   }

   @Override
   public ckt c(cja $$0) {
      return ckt.e;
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).b();
      if (!$$1.fR().d && !$$4) {
         return bgu.d($$3);
      } else {
         $$1.c($$2);
         return bgu.b($$3);
      }
   }

   @Override
   public Predicate<cja> b() {
      return c;
   }

   @Override
   public int d() {
      return 15;
   }
}
