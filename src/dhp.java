import com.mojang.serialization.MapCodec;

public abstract class dhp extends dhn implements ded {
   public static final dsd e = drt.ax;
   public static final int f = 25;
   private final double c;

   protected dhp(drc.d $$0, it $$1, evf $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dhp> a();

   @Override
   public drd a(dba $$0) {
      return this.n().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   protected boolean d_(drd $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         io $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected drd a(drd $$0, aym $$1) {
      return $$0.a(e);
   }

   public drd n(drd $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(drd $$0) {
      return $$0.c(e) == 25;
   }

   protected drd a(drd $$0, drd $$1) {
      return $$1;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, emx.c, emx.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().n());
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      io $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(aym var1);

   protected abstract boolean g(drd var1);

   @Override
   protected dhp c() {
      return this;
   }
}
