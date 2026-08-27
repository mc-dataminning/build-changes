import com.mojang.serialization.MapCodec;

public class dhd extends dbo {
   public static final MapCodec<dhd> d = b(dhd::new);

   @Override
   public MapCodec<dhd> a() {
      return d;
   }

   public dhd(dpx.d $$0) {
      super($$0, js.e);
   }

   @Override
   protected double b(dpy $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dpy $$0) {
      return true;
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.ay();
      }
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return 3;
   }
}
