public abstract class cvx extends cvv implements csm {
   public static final dfy d = dfo.ax;
   public static final int e = 25;
   private final double f;

   protected cvx(dex.d $$0, hb $$1, ehy $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.f = $$4;
      this.k(this.C.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public dey a(cpl $$0) {
      return this.n().a(d, Integer.valueOf($$0.y_().a(25)));
   }

   @Override
   public boolean e_(dey $$0) {
      return $$0.c(d) < 25;
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$0.c(d) < 25 && $$3.j() < this.f) {
         gv $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dey a(dey $$0, art $$1) {
      return $$0.a(d);
   }

   public dey n(dey $$0) {
      return $$0.a(d, Integer.valueOf(25));
   }

   public boolean o(dey $$0) {
      return $$0.c(d) == 25;
   }

   protected dey a(dey $$0, dey $$1) {
      return $$1;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.a())) {
         if (this.b) {
            $$3.a($$4, eac.c, eac.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.a().n());
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(d);
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      gv $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(d) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(d, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(art var1);

   protected abstract boolean g(dey var1);

   @Override
   protected cvx b() {
      return this;
   }
}
