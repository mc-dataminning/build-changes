import com.mojang.serialization.MapCodec;

public abstract class cyi extends cyg implements cuw {
   public static final dhw e = dhm.ax;
   public static final int f = 25;
   private final double c;

   protected cyi(dgv.d $$0, hx $$1, ekb $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends cyi> a();

   @Override
   public dgw a(crt $$0) {
      return this.o().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   public boolean e_(dgw $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         ht $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dgw a(dgw $$0, ato $$1) {
      return $$0.a(e);
   }

   public dgw n(dgw $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dgw $$0) {
      return $$0.c(e) == 25;
   }

   protected dgw a(dgw $$0, dgw $$1) {
      return $$1;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, ech.c, ech.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      ht $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(ato var1);

   protected abstract boolean g(dgw var1);

   @Override
   protected cyi c() {
      return this;
   }
}
