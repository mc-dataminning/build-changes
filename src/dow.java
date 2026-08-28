import com.mojang.serialization.MapCodec;

public class dow extends djf {
   public static final MapCodec<dow> d = b(dow::new);

   @Override
   public MapCodec<dow> a() {
      return d;
   }

   public dow(dxu.d $$0) {
      super($$0, kn.e);
   }

   @Override
   protected double b(dxv $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dxv $$0) {
      return true;
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aE();
      }
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return 3;
   }
}
