import com.mojang.serialization.MapCodec;

public abstract class diu extends dis implements dfi {
   public static final dth e = dsx.ax;
   public static final int f = 25;
   private final double c;

   protected diu(dsg.d $$0, jf $$1, ews $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends diu> a();

   @Override
   public dsh a(dce $$0) {
      return this.o().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   protected boolean d_(dsh $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         ja $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dsh a(dsh $$0, aym $$1) {
      return $$0.a(e);
   }

   public dsh n(dsh $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dsh $$0) {
      return $$0.c(e) == 25;
   }

   protected dsh a(dsh $$0, dsh $$1) {
      return $$1;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, eoc.c, eoc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      ja $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(aym var1);

   protected abstract boolean g(dsh var1);

   @Override
   protected diu c() {
      return this;
   }
}
