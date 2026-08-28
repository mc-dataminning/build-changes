import com.mojang.serialization.MapCodec;

public abstract class dlb extends dkz implements dhp {
   public static final dvs e = dvi.ax;
   public static final int f = 25;
   private final double c;

   protected dlb(dur.d $$0, jk $$1, ezq $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dlb> a();

   @Override
   public dus a(dek $$0) {
      return this.n().b(e, Integer.valueOf($$0.D_().a(25)));
   }

   @Override
   protected boolean f(dus $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         jf $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dus a(dus $$0, azn $$1) {
      return $$0.a(e);
   }

   public dus p(dus $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(dus $$0) {
      return $$0.c(e) == 25;
   }

   protected dus a(dus $$0, dus $$1) {
      return $$1;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, equ.c, equ.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().n());
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      jf $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azn var1);

   protected abstract boolean h(dus var1);

   @Override
   protected dlb c() {
      return this;
   }
}
