import java.util.function.Predicate;

public class cnq extends cqg {
   public static final int a = 20;
   public static final int b = 15;

   public cnq(cpl.a $$0) {
      super($$0);
   }

   @Override
   public void a(cpq $$0, cwe $$1, box $$2, int $$3) {
      if ($$2 instanceof cia $$4) {
         boolean $$5 = $$4.fW().d || cua.a(cuc.B, $$0) > 0;
         cpq $$6 = $$4.g($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new cpq(cpt.ou);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(cpt.ou);
               if (!$$1.B) {
                  cng $$10 = (cng)($$6.d() instanceof cng ? $$6.d() : cpt.ou);
                  cig $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.dB(), $$4.dz(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = cua.a(cuc.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.z() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = cua.a(cuc.z, $$0);
                  if ($$13 > 0) {
                     $$11.b($$13);
                  }

                  if (cua.a(cuc.A, $$0) > 0) {
                     $$11.g(100);
                  }

                  $$0.a(1, $$4, box.d($$4.fq()));
                  if ($$9 || $$4.fW().d && ($$6.a(cpt.vl) || $$6.a(cpt.vm))) {
                     $$11.d = cig.a.c;
                  }

                  $$1.b($$11);
               }

               $$1.a(null, $$4.do(), $$4.dq(), $$4.du(), atp.aE, atq.h, 1.0F, 1.0F / ($$1.F_().i() * 0.4F + 1.2F) + $$8 * 0.5F);
               if (!$$9 && !$$4.fW().d) {
                  $$6.h(1);
                  if ($$6.b()) {
                     $$4.fV().g($$6);
                  }
               }

               $$4.b(atz.c.b(this));
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
   public int b(cpq $$0) {
      return 72000;
   }

   @Override
   public crj c(cpq $$0) {
      return crj.e;
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).b();
      if (!$$1.fW().d && !$$4) {
         return bmm.d($$3);
      } else {
         $$1.c($$2);
         return bmm.b($$3);
      }
   }

   @Override
   public Predicate<cpq> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
