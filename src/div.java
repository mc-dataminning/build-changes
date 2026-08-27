import com.mojang.serialization.MapCodec;

public abstract class div extends dit implements dff {
   public static final duc e = dts.ax;
   public static final int f = 25;
   private final double c;

   protected div(dtb.d $$0, iw $$1, exn $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends div> a();

   @Override
   public dtc a(dcb $$0) {
      return this.n().a(e, Integer.valueOf($$0.F_().a(25)));
   }

   @Override
   protected boolean d_(dtc $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         ir $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected dtc a(dtc $$0, ayt $$1) {
      return $$0.a(e);
   }

   public dtc n(dtc $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dtc $$0) {
      return $$0.c(e) == 25;
   }

   protected dtc a(dtc $$0, dtc $$1) {
      return $$1;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, epf.c, epf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().n());
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      ir $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(ayt var1);

   protected abstract boolean g(dtc var1);

   @Override
   protected div c() {
      return this;
   }
}
