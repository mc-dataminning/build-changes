import com.mojang.serialization.MapCodec;

public class dnn extends dis {
   public static final MapCodec<dnn> a = b(dnn::new);
   protected static final fal b = dij.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dnn> a() {
      return a;
   }

   public dnn(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b;
   }

   @Override
   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      return $$0.a(axd.aN) || $$0.a(dil.dX) || super.b($$0, $$1, $$2);
   }
}
