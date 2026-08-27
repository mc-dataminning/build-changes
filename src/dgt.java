import com.mojang.serialization.MapCodec;

public abstract class dgt extends dgr implements ddh {
   public static final drh e = dqx.ax;
   public static final int f = 25;
   private final double c;

   protected dgt(dqg.d $$0, is $$1, eui $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dgt> a();

   @Override
   public dqh a(dae $$0) {
      return this.n().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   protected boolean d_(dqh $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         in $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dqh a(dqh $$0, ayg $$1) {
      return $$0.a(e);
   }

   public dqh n(dqh $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dqh $$0) {
      return $$0.c(e) == 25;
   }

   protected dqh a(dqh $$0, dqh $$1) {
      return $$1;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, emb.c, emb.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().n());
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      in $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(ayg var1);

   protected abstract boolean g(dqh var1);

   @Override
   protected dgt c() {
      return this;
   }
}
