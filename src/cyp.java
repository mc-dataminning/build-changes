import com.mojang.serialization.MapCodec;

public abstract class cyp extends cyn implements cvd {
   public static final dii e = dhy.ax;
   public static final int f = 25;
   private final double c;

   protected cyp(dhh.d $$0, hx $$1, ekn $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends cyp> a();

   @Override
   public dhi a(csb $$0) {
      return this.o().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   public boolean e_(dhi $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         ht $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dhi a(dhi $$0, ats $$1) {
      return $$0.a(e);
   }

   public dhi n(dhi $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dhi $$0) {
      return $$0.c(e) == 25;
   }

   protected dhi a(dhi $$0, dhi $$1) {
      return $$1;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, ect.c, ect.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      ht $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(ats var1);

   protected abstract boolean g(dhi var1);

   @Override
   protected cyp c() {
      return this;
   }
}
