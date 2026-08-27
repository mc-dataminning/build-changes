import com.mojang.serialization.MapCodec;

public abstract class cvj extends cwq {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final emm h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final emm b = emj.a(
      emj.b(), emj.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), elx.e
   );
   protected final jd.a c;

   @Override
   protected abstract MapCodec<? extends cvj> a();

   public cvj(djg.d $$0, jd.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(djh $$0) {
      return 0.0;
   }

   protected boolean a(djh $$0, hx $$1, blv $$2) {
      return $$2.dt() < (double)$$1.v() + this.b($$0) && $$2.cH().e > (double)$$1.v() + 0.25;
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      cmy $$6 = $$3.b($$4);
      jd $$7 = this.c.b().get($$6.d());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return b;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2) {
      return h;
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   public abstract boolean d(djh var1);

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      hx $$4 = dch.a((ctp)$$1, $$2);
      if ($$4 != null) {
         eeq $$5 = dch.a($$1, $$4);
         if ($$5 != ees.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eeq $$0) {
      return false;
   }

   protected void a(djh $$0, ctp $$1, hx $$2, eeq $$3) {
   }
}
