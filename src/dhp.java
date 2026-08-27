import com.mojang.serialization.MapCodec;

public class dhp extends dhf implements dcy {
   public static final MapCodec<dhp> a = b(dhp::new);

   @Override
   public MapCodec<dhp> a() {
      return a;
   }

   public dhp(dpx.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      $$0.a($$2.d(), dhq.c(), 2);
   }

   @Override
   public im a(im $$0) {
      return $$0.d();
   }
}
