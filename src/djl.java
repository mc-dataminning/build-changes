import com.mojang.serialization.MapCodec;

public abstract class djl extends djj implements dfz {
   public static final dua e = dtq.ax;
   public static final int f = 25;
   private final double c;

   protected djl(dsz.d $$0, ji $$1, exp $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends djl> a();

   @Override
   public dta a(dcv $$0) {
      return this.o().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   protected boolean d_(dta $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         jd $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dta a(dta $$0, ayv $$1) {
      return $$0.a(e);
   }

   public dta n(dta $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dta $$0) {
      return $$0.c(e) == 25;
   }

   protected dta a(dta $$0, dta $$1) {
      return $$1;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, eoz.c, eoz.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      jd $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(ayv var1);

   protected abstract boolean g(dta var1);

   @Override
   protected djl c() {
      return this;
   }
}
