import java.util.function.Predicate;

public class cok extends cra {
   public static final int a = 20;
   public static final int b = 15;

   public cok(cqf.a $$0) {
      super($$0);
   }

   @Override
   public void a(cqk $$0, cwz $$1, bpo $$2, int $$3) {
      if ($$2 instanceof cis $$4) {
         boolean $$5 = $$4.fM() || cuv.a(cux.B, $$0) > 0;
         cqk $$6 = $$4.g($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new cqk(cqn.ou);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(cqn.ou);
               if (!$$1.B) {
                  coa $$10 = (coa)($$6.d() instanceof coa ? $$6.d() : cqn.ou);
                  ciy $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.dE(), $$4.dC(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = cuv.a(cux.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.y() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = cuv.a(cux.z, $$0);
                  if ($$13 > 0) {
                     $$11.b($$13);
                  }

                  if (cuv.a(cux.A, $$0) > 0) {
                     $$11.g(100);
                  }

                  $$0.a(1, $$4, bpo.d($$4.ft()));
                  if ($$9 || $$4.fM() && ($$6.a(cqn.vm) || $$6.a(cqn.vn))) {
                     $$11.d = ciy.a.c;
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
   public int b(cqk $$0) {
      return 72000;
   }

   @Override
   public csd c(cqk $$0) {
      return csd.e;
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      cqk $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).b();
      if (!$$1.fM() && !$$4) {
         return bnd.d($$3);
      } else {
         $$1.c($$2);
         return bnd.b($$3);
      }
   }

   @Override
   public Predicate<cqk> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
