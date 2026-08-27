import com.mojang.serialization.MapCodec;

public abstract class cvc extends cwj {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final emf h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final emf b = emc.a(
      emc.b(), emc.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), elq.e
   );
   protected final jd.a c;

   @Override
   protected abstract MapCodec<? extends cvc> a();

   public cvc(diz.d $$0, jd.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dja $$0) {
      return 0.0;
   }

   protected boolean a(dja $$0, hx $$1, blp $$2) {
      return $$2.dt() < (double)$$1.v() + this.b($$0) && $$2.cH().e > (double)$$1.v() + 0.25;
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      cmr $$6 = $$3.b($$4);
      jd $$7 = this.c.b().get($$6.d());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2) {
      return h;
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   public abstract boolean d(dja var1);

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      hx $$4 = dca.a((cti)$$1, $$2);
      if ($$4 != null) {
         eej $$5 = dca.a($$1, $$4);
         if ($$5 != eel.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eej $$0) {
      return false;
   }

   protected void a(dja $$0, cti $$1, hx $$2, eej $$3) {
   }
}
