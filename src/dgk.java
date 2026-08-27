import com.mojang.serialization.MapCodec;

public abstract class dgk extends dgi implements dcy {
   public static final dqy e = dqo.ax;
   public static final int f = 25;
   private final double c;

   protected dgk(dpx.d $$0, ir $$1, ety $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dgk> a();

   @Override
   public dpy a(czv $$0) {
      return this.n().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   protected boolean e_(dpy $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         im $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dpy a(dpy $$0, ayd $$1) {
      return $$0.a(e);
   }

   public dpy n(dpy $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dpy $$0) {
      return $$0.c(e) == 25;
   }

   protected dpy a(dpy $$0, dpy $$1) {
      return $$1;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, els.c, els.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().n());
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      im $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(ayd var1);

   protected abstract boolean g(dpy var1);

   @Override
   protected dgk c() {
      return this;
   }
}
