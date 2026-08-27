import com.mojang.serialization.MapCodec;

public abstract class dfn extends dfl implements dcb {
   public static final dpz e = dpp.ax;
   public static final int f = 25;
   private final double c;

   protected dfn(doy.d $$0, ih $$1, est $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dfn> a();

   @Override
   public doz a(cyy $$0) {
      return this.n().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   protected boolean e_(doz $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         ib $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected doz a(doz $$0, axr $$1) {
      return $$0.a(e);
   }

   public doz n(doz $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(doz $$0) {
      return $$0.c(e) == 25;
   }

   protected doz a(doz $$0, doz $$1) {
      return $$1;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, ekt.c, ekt.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().n());
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      ib $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(axr var1);

   protected abstract boolean g(doz var1);

   @Override
   protected dfn c() {
      return this;
   }
}
