import com.mojang.serialization.MapCodec;

public abstract class cvr extends cwy {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final emv h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final emv b = ems.a(
      ems.b(), ems.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), emg.e
   );
   protected final jd.a c;

   @Override
   protected abstract MapCodec<? extends cvr> a();

   public cvr(djo.d $$0, jd.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(djp $$0) {
      return 0.0;
   }

   protected boolean a(djp $$0, hx $$1, blw $$2) {
      return $$2.ds() < (double)$$1.v() + this.b($$0) && $$2.cH().e > (double)$$1.v() + 0.25;
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      jd $$7 = this.c.b().get($$0.d());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2) {
      return h;
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   public abstract boolean d(djp var1);

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      hx $$4 = dcp.a((ctx)$$1, $$2);
      if ($$4 != null) {
         eey $$5 = dcp.a($$1, $$4);
         if ($$5 != efa.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eey $$0) {
      return false;
   }

   protected void a(djp $$0, ctx $$1, hx $$2, eey $$3) {
   }
}
