import java.util.Optional;
import javax.annotation.Nullable;

public abstract class euw extends eur {
   public static final float e = 0.44444445F;

   @Override
   public eus d() {
      return euu.d;
   }

   @Override
   public eus e() {
      return euu.e;
   }

   @Override
   public cxu a() {
      return cyc.rl;
   }

   @Override
   public void a(dhp $$0, jj $$1, eut $$2, azs $$3) {
      jj $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(lv.ab, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, awk.ou, awl.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awk.os, awl.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void a(arn $$0, jj $$1, eut $$2, azs $$3) {
      if ($$0.O().c(dhl.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            jj $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dym $$7 = $$0.a_($$5);
               if ($$7.l()) {
                  if (this.a((dhs)$$0, $$5)) {
                     $$0.b($$5, dkh.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               jj $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.d()) && this.b($$0, $$9)) {
                  $$0.b($$9.d(), dkh.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dhs $$0, jj $$1) {
      for (jo $$2 : jo.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dhs $$0, jj $$1) {
      return $$0.d($$1.v()) && !$$0.B($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public lt h() {
      return lv.i;
   }

   @Override
   protected void a(dhq $$0, jj $$1, dym $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dhs $$0) {
      return $$0.B_().i() ? 4 : 2;
   }

   @Override
   public dym b(eut $$0) {
      return dkw.K.m().b(dpo.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eus $$0) {
      return $$0 == euu.e || $$0 == euu.d;
   }

   @Override
   public int c(dhs $$0) {
      return $$0.B_().i() ? 1 : 2;
   }

   @Override
   public boolean a(eut $$0, dgv $$1, jj $$2, eus $$3, jo $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(axf.a);
   }

   @Override
   public int a(dhs $$0) {
      return $$0.B_().i() ? 10 : 30;
   }

   @Override
   public int a(dhp $$0, jj $$1, eut $$2, eut $$3) {
      int $$4 = this.a($$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.C_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dhq $$0, jj $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(arn $$0) {
      return $$0.O().c(dhl.W);
   }

   @Override
   protected void a(dhq $$0, jj $$1, dym $$2, jo $$3, eut $$4) {
      if ($$3 == jo.a) {
         eut $$5 = $$0.b_($$1);
         if (this.a(axf.b) && $$5.a(axf.a)) {
            if ($$2.b() instanceof dpo) {
               $$0.a($$1, dkw.b.m(), 3);
            }

            this.a($$0, $$1);
            return;
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean i() {
      return true;
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awj> j() {
      return Optional.of(awk.dm);
   }

   public static class a extends euw {
      @Override
      protected void a(dyn.a<eus, eut> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eut $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eut $$0) {
         return false;
      }
   }

   public static class b extends euw {
      @Override
      public int d(eut $$0) {
         return 8;
      }

      @Override
      public boolean c(eut $$0) {
         return true;
      }
   }
}
