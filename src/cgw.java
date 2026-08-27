import java.util.function.Predicate;

public class cgw extends cjo implements cks {
   public static final int a = 20;
   public static final int b = 15;

   public cgw(cit.a $$0) {
      super($$0);
   }

   @Override
   public void a(ciy $$0, cpm $$1, biy $$2, int $$3) {
      if ($$2 instanceof cbn $$4) {
         boolean $$5 = $$4.fR().d || cnh.a(cnj.B, $$0) > 0;
         ciy $$6 = $$4.g($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new ciy(cjb.nH);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(cjb.nH);
               if (!$$1.B) {
                  cgm $$10 = (cgm)($$6.d() instanceof cgm ? $$6.d() : cjb.nH);
                  cbt $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.dC(), $$4.dA(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = cnh.a(cnj.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.q() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = cnh.a(cnj.z, $$0);
                  if ($$13 > 0) {
                     $$11.b($$13);
                  }

                  if (cnh.a(cnj.A, $$0) > 0) {
                     $$11.g(100);
                  }

                  $$0.a(1, $$4, $$1x -> $$1x.d($$4.fm()));
                  if ($$9 || $$4.fR().d && ($$6.a(cjb.uv) || $$6.a(cjb.uw))) {
                     $$11.d = cbt.a.c;
                  }

                  $$1.b($$11);
               }

               $$1.a(null, $$4.dp(), $$4.dr(), $$4.dv(), aow.ar, aox.h, 1.0F, 1.0F / ($$1.y_().i() * 0.4F + 1.2F) + $$8 * 0.5F);
               if (!$$9 && !$$4.fR().d) {
                  $$6.h(1);
                  if ($$6.b()) {
                     $$4.fQ().g($$6);
                  }
               }

               $$4.b(apg.c.b(this));
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
   public int b(ciy $$0) {
      return 72000;
   }

   @Override
   public ckr c(ciy $$0) {
      return ckr.e;
   }

   @Override
   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      ciy $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).b();
      if (!$$1.fR().d && !$$4) {
         return bgr.d($$3);
      } else {
         $$1.c($$2);
         return bgr.b($$3);
      }
   }

   @Override
   public Predicate<ciy> b() {
      return c;
   }

   @Override
   public int d() {
      return 15;
   }
}
