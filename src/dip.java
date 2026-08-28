import com.mojang.serialization.MapCodec;

public abstract class dip extends din implements dfd {
   public static final dtd e = dst.ax;
   public static final int f = 25;
   private final double c;

   protected dip(dsc.d $$0, je $$1, ewl $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dip> a();

   @Override
   public dsd a(dca $$0) {
      return this.o().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   protected boolean d_(dsd $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         iz $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dsd a(dsd $$0, azh $$1) {
      return $$0.a(e);
   }

   public dsd n(dsd $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dsd $$0) {
      return $$0.c(e) == 25;
   }

   protected dsd a(dsd $$0, dsd $$1) {
      return $$1;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, enx.c, enx.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
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

   protected abstract boolean g(dsd var1);

   @Override
   protected dip c() {
      return this;
   }
}
