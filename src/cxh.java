import com.mojang.serialization.MapCodec;

public abstract class cxh extends cyo {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final eol h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final eol b = eoi.a(
      eoi.b(), eoi.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), enw.e
   );
   protected final jf.a c;

   @Override
   protected abstract MapCodec<? extends cxh> a();

   public cxh(dle.d $$0, jf.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dlf $$0) {
      return 0.0;
   }

   protected boolean a(dlf $$0, hz $$1, bno $$2) {
      return $$2.dt() < (double)$$1.v() + this.b($$0) && $$2.cH().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      jf $$7 = this.c.b().get($$0.d());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2) {
      return h;
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   public abstract boolean d(dlf var1);

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      hz $$4 = def.a((cvn)$$1, $$2);
      if ($$4 != null) {
         ego $$5 = def.a($$1, $$4);
         if ($$5 != egq.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(ego $$0) {
      return false;
   }

   protected void a(dlf $$0, cvn $$1, hz $$2, ego $$3) {
   }
}
