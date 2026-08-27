import java.util.function.Predicate;

public class com extends crc {
   public static final int a = 20;
   public static final int b = 15;

   public com(cqh.a $$0) {
      super($$0);
   }

   @Override
   public void a(cqm $$0, cxb $$1, bpp $$2, int $$3) {
      if ($$2 instanceof ciu $$4) {
         boolean $$5 = $$4.fM() || cux.a(cuz.B, $$0) > 0;
         cqm $$6 = $$4.g($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new cqm(cqp.ou);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(cqp.ou);
               if (!$$1.B) {
                  coc $$10 = (coc)($$6.d() instanceof coc ? $$6.d() : cqp.ou);
                  cja $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.dE(), $$4.dC(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = cux.a(cuz.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.y() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = cux.a(cuz.z, $$0);
                  if ($$13 > 0) {
                     $$11.b($$13);
                  }

                  if (cux.a(cuz.A, $$0) > 0) {
                     $$11.g(100);
                  }

                  $$0.a(1, $$4, bpp.d($$4.ft()));
                  if ($$9 || $$4.fM() && ($$6.a(cqp.vn) || $$6.a(cqp.vo))) {
                     $$11.d = cja.a.c;
                  }

                  $$1.b($$11);
               }

               $$1.a(null, $$4.dr(), $$4.dt(), $$4.dx(), aty.aG, atz.h, 1.0F, 1.0F / ($$1.E_().i() * 0.4F + 1.2F) + $$8 * 0.5F);
               if (!$$9 && !$$4.fM()) {
                  $$6.h(1);
                  if ($$6.b()) {
                     $$4.fZ().g($$6);
                  }
               }

               $$4.b(aui.c.b(this));
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
   public int b(cqm $$0) {
      return 72000;
   }

   @Override
   public csf c(cqm $$0) {
      return csf.e;
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      cqm $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).b();
      if (!$$1.fM() && !$$4) {
         return bne.d($$3);
      } else {
         $$1.c($$2);
         return bne.b($$3);
      }
   }

   @Override
   public Predicate<cqm> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
