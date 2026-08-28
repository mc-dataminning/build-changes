import com.mojang.serialization.MapCodec;

public abstract class dol extends doj implements dkx {
   public static final dzm e = dzc.aA;
   public static final int f = 25;
   private final double c;

   protected dol(dyl.d $$0, jo $$1, fdo $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.B.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dol> a();

   @Override
   public dym b(azs $$0) {
      return this.m().b(e, Integer.valueOf($$0.a(25)));
   }

   @Override
   protected boolean f(dym $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         jj $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected dym a(dym $$0, azs $$1) {
      return $$0.a(e);
   }

   public dym p(dym $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(dym $$0) {
      return $$0.c(e) == 25;
   }

   protected dym a(dym $$0, dym $$1) {
      return $$1;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$4 != this.a || !$$6.a(this) && !$$6.a(this.b())) {
         if (this.b) {
            $$2.a($$3, euu.c, euu.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      jj $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azs var1);

   protected abstract boolean h(dym var1);

   @Override
   protected dol c() {
      return this;
   }
}
