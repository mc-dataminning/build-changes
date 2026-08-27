import com.mojang.serialization.MapCodec;

public abstract class dhn extends dhl implements deb {
   public static final dsb e = drr.ax;
   public static final int f = 25;
   private final double c;

   protected dhn(dra.d $$0, it $$1, evd $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dhn> a();

   @Override
   public drb a(day $$0) {
      return this.n().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   protected boolean d_(drb $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         io $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected drb a(drb $$0, ayk $$1) {
      return $$0.a(e);
   }

   public drb n(drb $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(drb $$0) {
      return $$0.c(e) == 25;
   }

   protected drb a(drb $$0, drb $$1) {
      return $$1;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, emv.c, emv.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().n());
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      io $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(ayk var1);

   protected abstract boolean g(drb var1);

   @Override
   protected dhn c() {
      return this;
   }
}
