import com.mojang.serialization.MapCodec;

public class dax extends cxa {
   public static final MapCodec<dax> a = b(dax::new);
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
   public MapCodec<dax> a() {
      return a;
   }

   public dax(dhm.d $$0) {
      super($$0);
   }

   @Override
   protected cse d() {
      return clr.tY;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b[this.g($$0)];
   }
}
