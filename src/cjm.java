import java.util.function.Predicate;

public class cjm extends cme implements cni {
   public static final int a = 20;
   public static final int b = 15;

   public cjm(clj.a $$0) {
      super($$0);
   }

   @Override
   public void a(clo $$0, csf $$1, bll $$2, int $$3) {
      if ($$2 instanceof cdz $$4) {
         boolean $$5 = $$4.fU().d || cqb.a(cqd.B, $$0) > 0;
         clo $$6 = $$4.g($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new clo(clr.os);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(clr.os);
               if (!$$1.B) {
                  cjc $$10 = (cjc)($$6.d() instanceof cjc ? $$6.d() : clr.os);
                  cef $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.dF(), $$4.dD(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = cqb.a(cqd.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.z() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = cqb.a(cqd.z, $$0);
                  if ($$13 > 0) {
                     $$11.b($$13);
                  }

                  if (cqb.a(cqd.A, $$0) > 0) {
                     $$11.g(100);
                  }

                  $$0.a(1, $$4, $$1x -> $$1x.d($$4.fp()));
                  if ($$9 || $$4.fU().d && ($$6.a(clr.vh) || $$6.a(clr.vi))) {
                     $$11.d = cef.a.c;
                  }

                  $$1.b($$11);
               }

               $$1.a(null, $$4.ds(), $$4.du(), $$4.dy(), aqv.ar, aqw.h, 1.0F, 1.0F / ($$1.F_().i() * 0.4F + 1.2F) + $$8 * 0.5F);
               if (!$$9 && !$$4.fU().d) {
                  $$6.h(1);
                  if ($$6.b()) {
                     $$4.fT().g($$6);
                  }
               }

               $$4.b(arf.c.b(this));
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
   public int b(clo $$0) {
      return 72000;
   }

   @Override
   public cnh c(clo $$0) {
      return cnh.e;
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      clo $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).b();
      if (!$$1.fU().d && !$$4) {
         return bjc.d($$3);
      } else {
         $$1.c($$2);
         return bjc.b($$3);
      }
   }

   @Override
   public Predicate<clo> b() {
      return c;
   }

   @Override
   public int d() {
      return 15;
   }
}
