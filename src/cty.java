import com.mojang.serialization.MapCodec;

public abstract class cty extends cvf {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final eks h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final eks b = ekp.a(
      ekp.b(), ekp.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), ekd.e
   );
   protected final jc.a c;

   @Override
   protected abstract MapCodec<? extends cty> a();

   public cty(dhm.d $$0, jc.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dhn $$0) {
      return 0.0;
   }

   protected boolean a(dhn $$0, hx $$1, bkv $$2) {
      return $$2.du() < (double)$$1.v() + this.b($$0) && $$2.cH().e > (double)$$1.v() + 0.25;
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      clo $$6 = $$3.b($$4);
      jc $$7 = this.c.b().get($$6.d());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2) {
      return h;
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   public abstract boolean d(dhn var1);

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      hx $$4 = daw.a((csf)$$1, $$2);
      if ($$4 != null) {
         ecw $$5 = daw.a($$1, $$4);
         if ($$5 != ecy.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(ecw $$0) {
      return false;
   }

   protected void a(dhn $$0, csf $$1, hx $$2, ecw $$3) {
   }
}
