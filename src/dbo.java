import com.mojang.serialization.MapCodec;

public abstract class dbo extends dcv {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final ety h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final ety b = etv.a(
      etv.b(), etv.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), etj.e
   );
   protected final js.a c;

   @Override
   protected abstract MapCodec<? extends dbo> a();

   public dbo(dpx.d $$0, js.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dpy $$0) {
      return 0.0;
   }

   protected boolean a(dpy $$0, im $$1, bql $$2) {
      return $$2.du() < (double)$$1.v() + this.b($$0) && $$2.cI().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      js $$7 = this.c.b().get($$0.f());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2) {
      return h;
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   public abstract boolean d(dpy var1);

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      im $$4 = din.a((czu)$$1, $$2);
      if ($$4 != null) {
         elq $$5 = din.a($$1, $$4);
         if ($$5 != els.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(elq $$0) {
      return false;
   }

   protected void a(dpy $$0, czu $$1, im $$2, elq $$3) {
   }
}
