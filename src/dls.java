import com.mojang.serialization.MapCodec;

public abstract class dls extends dlq implements dih {
   public static final dwj e = dvz.ax;
   public static final int f = 25;
   private final double c;

   protected dls(dvi.d $$0, jm $$1, fah $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dls> a();

   @Override
   public dvj a(dfc $$0) {
      return this.m().b(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   protected boolean f(dvj $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         jh $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected dvj a(dvj $$0, azs $$1) {
      return $$0.a(e);
   }

   public dvj p(dvj $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(dvj $$0) {
      return $$0.c(e) == 25;
   }

   protected dvj a(dvj $$0, dvj $$1) {
      return $$1;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, erl.c, erl.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      jh $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azs var1);

   protected abstract boolean h(dvj var1);

   @Override
   protected dls c() {
      return this;
   }
}
