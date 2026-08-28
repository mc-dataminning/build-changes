import com.mojang.serialization.MapCodec;

public abstract class diq extends dio implements dfe {
   public static final dte e = dsu.ax;
   public static final int f = 25;
   private final double c;

   protected diq(dsd.d $$0, je $$1, ewm $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends diq> a();

   @Override
   public dse a(dcb $$0) {
      return this.o().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   protected boolean d_(dse $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         iz $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dse a(dse $$0, azh $$1) {
      return $$0.a(e);
   }

   public dse n(dse $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dse $$0) {
      return $$0.c(e) == 25;
   }

   protected dse a(dse $$0, dse $$1) {
      return $$1;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, eny.c, eny.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      iz $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azh var1);

   protected abstract boolean g(dse var1);

   @Override
   protected diq c() {
      return this;
   }
}
