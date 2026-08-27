import com.mojang.serialization.MapCodec;

public abstract class dch extends dcf implements cyv {
   public static final dmj e = dlz.ax;
   public static final int f = 25;
   private final double c;

   protected dch(dli.d $$0, ie $$1, eos $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dch> a();

   @Override
   public dlj a(cvs $$0) {
      return this.o().a(e, Integer.valueOf($$0.F_().a(25)));
   }

   @Override
   protected boolean e_(dlj $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         hz $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dlj a(dlj $$0, awp $$1) {
      return $$0.a(e);
   }

   public dlj n(dlj $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dlj $$0) {
      return $$0.c(e) == 25;
   }

   protected dlj a(dlj $$0, dlj $$1) {
      return $$1;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, egx.c, egx.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      hz $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(awp var1);

   protected abstract boolean g(dlj var1);

   @Override
   protected dch c() {
      return this;
   }
}
