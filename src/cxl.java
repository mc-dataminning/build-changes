import com.mojang.serialization.MapCodec;

public abstract class cxl extends cys {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final eos h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final eos b = eop.a(
      eop.b(), eop.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), eod.e
   );
   protected final jf.a c;

   @Override
   protected abstract MapCodec<? extends cxl> a();

   public cxl(dli.d $$0, jf.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dlj $$0) {
      return 0.0;
   }

   protected boolean a(dlj $$0, hz $$1, bnq $$2) {
      return $$2.dt() < (double)$$1.v() + this.b($$0) && $$2.cH().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      jf $$7 = this.c.b().get($$0.d());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return b;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2) {
      return h;
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   public abstract boolean d(dlj var1);

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      hz $$4 = dej.a((cvr)$$1, $$2);
      if ($$4 != null) {
         egv $$5 = dej.a($$1, $$4);
         if ($$5 != egx.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(egv $$0) {
      return false;
   }

   protected void a(dlj $$0, cvr $$1, hz $$2, egv $$3) {
   }
}
