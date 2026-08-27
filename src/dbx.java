import com.mojang.serialization.MapCodec;

public class dbx extends dde implements dcy {
   public static final MapCodec<dbx> a = b(dbx::new);
   private static final ety b = etv.a(dcv.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dcv.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dbx> a() {
      return a;
   }

   protected dbx(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b;
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return $$0.a(dcx.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      dpn.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
