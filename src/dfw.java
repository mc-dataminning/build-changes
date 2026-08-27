import com.mojang.serialization.MapCodec;

public abstract class dfw extends dfu implements dck {
   public static final dqi e = dpy.ax;
   public static final int f = 25;
   private final double c;

   protected dfw(dph.d $$0, ij $$1, etc $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dfw> a();

   @Override
   public dpi a(czh $$0) {
      return this.n().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   protected boolean e_(dpi $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         id $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dpi a(dpi $$0, axt $$1) {
      return $$0.a(e);
   }

   public dpi n(dpi $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dpi $$0) {
      return $$0.c(e) == 25;
   }

   protected dpi a(dpi $$0, dpi $$1) {
      return $$1;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, elc.c, elc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().n());
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      id $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(axt var1);

   protected abstract boolean g(dpi var1);

   @Override
   protected dfw c() {
      return this;
   }
}
