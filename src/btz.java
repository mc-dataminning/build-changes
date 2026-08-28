public abstract class btz extends bts {
   protected static final float bX = 0.0F;

   protected btz(btb<? extends btz> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public float d(iz $$0) {
      return this.a($$0, this.dP());
   }

   public float a(iz $$0, dcc $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dca $$0, btu $$1) {
      return this.a(this.dp(), $$0) >= 0.0F;
   }

   public boolean gm() {
      return !this.K().l();
   }

   public boolean gn() {
      if (this.bD.a(ccu.Z)) {
         return this.bD.c(ccu.Z).isPresent();
      } else {
         for (ccc $$0 : this.bS.b()) {
            if ($$0.h() && $$0.k() instanceof cbh) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected void gc() {
      super.gc();
      bsv $$0 = this.gf();
      if ($$0 != null && $$0.dP() == this.dP()) {
         this.a($$0.dp(), 5);
         float $$1 = this.f($$0);
         if (this instanceof bun && ((bun)this).y()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.F($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bS.a(cao.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.du() - this.du()) / (double)$$1;
            double $$3 = ($$0.dw() - this.dw()) / (double)$$1;
            double $$4 = ($$0.dA() - this.dA()) / (double)$$1;
            this.h(this.ds().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cq();
         } else if (this.go() && !this.gn()) {
            this.bS.b(cao.a.a);
            float $$5 = 2.0F;
            evs $$6 = new evs($$0.du() - this.du(), $$0.dw() - this.dw(), $$0.dA() - this.dA()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.K().a(this.du() + $$6.c, this.dw() + $$6.d, this.dA() + $$6.e, this.gp());
         }
      }
   }

   protected boolean go() {
      return true;
   }

   protected double gp() {
      return 1.0;
   }

   protected void F(float $$0) {
   }
}
