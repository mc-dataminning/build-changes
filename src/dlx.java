import com.mojang.serialization.MapCodec;

public abstract class dlx extends dlv implements dim {
   public static final dwn e = dwe.ax;
   public static final int f = 25;
   private final double c;

   protected dlx(dvn.d $$0, jm $$1, fal $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dlx> a();

   @Override
   public dvo b(azv $$0) {
      return this.m().b(e, Integer.valueOf($$0.a(25)));
   }

   @Override
   protected boolean f(dvo $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         jh $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected dvo a(dvo $$0, azv $$1) {
      return $$0.a(e);
   }

   public dvo p(dvo $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(dvo $$0) {
      return $$0.c(e) == 25;
   }

   protected dvo a(dvo $$0, dvo $$1) {
      return $$1;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$4 != this.a || !$$6.a(this) && !$$6.a(this.b())) {
         if (this.b) {
            $$2.a($$3, erp.c, erp.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      jh $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azv var1);

   protected abstract boolean h(dvo var1);

   @Override
   protected dlx c() {
      return this;
   }
}
