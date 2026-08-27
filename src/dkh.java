import com.mojang.serialization.MapCodec;

public class dkh extends dcv {
   public static final MapCodec<dkh> a = b(dkh::new);
   protected static final ety b = dcv.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dkh> a() {
      return a;
   }

   public dkh(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b;
   }

   @Override
   protected ety b_(dpy $$0, cza $$1, im $$2) {
      return etv.b();
   }

   @Override
   protected ety c(dpy $$0, cza $$1, im $$2, etk $$3) {
      return etv.b();
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      ddb.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$1 == ir.b && $$2.a(dcx.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   @Override
   protected float d(dpy $$0, cza $$1, im $$2) {
      return 0.2F;
   }
}
