import com.mojang.serialization.MapCodec;

public abstract class cyu extends cys implements cvi {
   public static final din e = did.ax;
   public static final int f = 25;
   private final double c;

   protected cyu(dhm.d $$0, ib $$1, eks $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends cyu> a();

   @Override
   public dhn a(csg $$0) {
      return this.o().a(e, Integer.valueOf($$0.F_().a(25)));
   }

   @Override
   public boolean e_(dhn $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         hx $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dhn a(dhn $$0, atw $$1) {
      return $$0.a(e);
   }

   public dhn n(dhn $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dhn $$0) {
      return $$0.c(e) == 25;
   }

   protected dhn a(dhn $$0, dhn $$1) {
      return $$1;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, ecy.c, ecy.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      hx $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(atw var1);

   protected abstract boolean g(dhn var1);

   @Override
   protected cyu c() {
      return this;
   }
}
