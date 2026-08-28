import com.mojang.serialization.MapCodec;

public class dpj extends dlh {
   public static final MapCodec<dpj> a = b(dpj::new);
   private static final fbt[] b = new fbt[]{
      djl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dpj> a() {
      return a;
   }

   public dpj(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected dgg d() {
      return cws.vf;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return b[this.h($$0)];
   }
}
