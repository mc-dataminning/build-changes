import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eap extends eak {
   public static final float e = 0.44444445F;

   @Override
   public eal d() {
      return ean.d;
   }

   @Override
   public eal e() {
      return ean.e;
   }

   @Override
   public cja a() {
      return cji.pM;
   }

   @Override
   public void a(cpv $$0, gw $$1, eam $$2, asc $$3) {
      gw $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(iv.T, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, apd.mp, ape.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), apd.mn, ape.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(cpv $$0, gw $$1, eam $$2, asc $$3) {
      if ($$0.X().b(cpr.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            gw $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.o($$5)) {
                  return;
               }

               dfj $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((cpy)$$0, $$5)) {
                     $$0.b($$5, csj.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               gw $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.o($$9)) {
                  return;
               }

               if ($$0.t($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), csj.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(cpy $$0, gw $$1) {
      for (ha $$2 : ha.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(cpy $$0, gw $$1) {
      return $$1.v() >= $$0.H_() && $$1.v() < $$0.aj() && !$$0.A($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public it h() {
      return iv.j;
   }

   @Override
   protected void a(cpw $$0, gw $$1, dfj $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(cpy $$0) {
      return $$0.C_().i() ? 4 : 2;
   }

   @Override
   public dfj b(eam $$0) {
      return csw.H.n().a(cxi.a, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eal $$0) {
      return $$0 == ean.e || $$0 == ean.d;
   }

   @Override
   public int c(cpy $$0) {
      return $$0.C_().i() ? 1 : 2;
   }

   @Override
   public boolean a(eam $$0, cpb $$1, gw $$2, eal $$3, ha $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(apx.a);
   }

   @Override
   public int a(cpy $$0) {
      return $$0.C_().i() ? 10 : 30;
   }

   @Override
   public int a(cpv $$0, gw $$1, eam $$2, eam $$3) {
      int $$4 = this.a((cpy)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((cpb)$$0, $$1) > $$2.a((cpb)$$0, $$1) && $$0.D_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(cpw $$0, gw $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(cpv $$0) {
      return $$0.X().b(cpr.R);
   }

   @Override
   protected void a(cpw $$0, gw $$1, dfj $$2, ha $$3, eam $$4) {
      if ($$3 == ha.a) {
         eam $$5 = $$0.b_($$1);
         if (this.a(apx.b) && $$5.a(apx.a)) {
            if ($$2.b() instanceof cxi) {
               $$0.a($$1, csw.b.n(), 3);
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
   public Optional<apc> j() {
      return Optional.of(apd.cE);
   }

   public static class a extends eap {
      @Override
      protected void a(dfk.a<eal, eam> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eam $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eam $$0) {
         return false;
      }
   }

   public static class b extends eap {
      @Override
      public int d(eam $$0) {
         return 8;
      }

      @Override
      public boolean c(eam $$0) {
         return true;
      }
   }
}
