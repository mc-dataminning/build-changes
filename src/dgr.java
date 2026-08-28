import com.mojang.serialization.MapCodec;

public abstract class dgr extends dhy {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final fab h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final fab b = ezy.a(
      ezy.b(), ezy.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), ezl.e
   );
   protected final km.a c;

   @Override
   protected abstract MapCodec<? extends dgr> a();

   public dgr(dvc.d $$0, km.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dvd $$0) {
      return 0.0;
   }

   protected boolean a(dvd $$0, jg $$1, btz $$2) {
      return $$2.dE() < (double)$$1.v() + this.b($$0) && $$2.cS().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      km $$7 = this.c.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2) {
      return h;
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   public abstract boolean d(dvd var1);

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      jg $$4 = dnp.a((dev)$$1, $$2);
      if ($$4 != null) {
         erd $$5 = dnp.a($$1, $$4);
         if ($$5 != erf.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(erd $$0) {
      return false;
   }

   protected void a(dvd $$0, dev $$1, jg $$2, erd $$3) {
   }
}
