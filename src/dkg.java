import com.mojang.serialization.MapCodec;

public class dkg extends dci {
   public static final MapCodec<dkg> c = b(dkg::new);

   @Override
   public MapCodec<dkg> a() {
      return c;
   }

   public dkg(dpx.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return this.a($$0, $$3, $$4) ? this.n() : dcx.a.n();
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dpy $$0) {
      return $$0.a(avo.aT);
   }

   @Override
   protected boolean f(dpy $$0) {
      return true;
   }
}
