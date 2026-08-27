import com.mojang.serialization.MapCodec;

public class dld extends dlh {
   public static final MapCodec<dld> a = b(dld::new);

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   public dld(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(dpy $$0, cza $$1, im $$2) {
      return false;
   }

   @Override
   protected int g(dpy $$0, cza $$1, im $$2) {
      return $$1.P();
   }
}
