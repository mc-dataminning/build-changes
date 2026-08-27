import com.mojang.serialization.MapCodec;

public abstract class cwq extends cwo implements ctf {
   public static final dgd e = dft.ax;
   public static final int f = 25;
   private final double c;

   protected cwq(dfc.d $$0, ha $$1, eia $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends cwq> a();

   @Override
   public dfd a(cqc $$0) {
      return this.o().a(e, Integer.valueOf($$0.D_().a(25)));
   }

   @Override
   public boolean e_(dfd $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         gw $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dfd a(dfd $$0, ash $$1) {
      return $$0.a(e);
   }

   public dfd n(dfd $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dfd $$0) {
      return $$0.c(e) == 25;
   }

   protected dfd a(dfd $$0, dfd $$1) {
      return $$1;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, eah.c, eah.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      gw $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(ash var1);

   protected abstract boolean g(dfd var1);

   @Override
   protected cwq c() {
      return this;
   }
}
