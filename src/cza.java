import com.mojang.serialization.MapCodec;

public class cza extends ctl {
   public static final MapCodec<cza> d = b(cza::new);

   @Override
   public MapCodec<cza> a() {
      return d;
   }

   public cza(dgv.d $$0) {
      super($$0, iy.e);
   }

   @Override
   protected double b(dgw $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dgw $$0) {
      return true;
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aw();
      }
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return 3;
   }
}
