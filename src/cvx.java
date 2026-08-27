import com.mojang.serialization.MapCodec;

public class cvx extends cxa {
   public static final MapCodec<cvx> a = b(cvx::new);
   private static final eks[] b = new eks[]{
      cvf.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<cvx> a() {
      return a;
   }

   public cvx(dhm.d $$0) {
      super($$0);
   }

   @Override
   protected cse d() {
      return clr.tX;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b[this.g($$0)];
   }
}
