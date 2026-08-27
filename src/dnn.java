import com.mojang.serialization.MapCodec;

public class dnn extends dhm {
   public static final MapCodec<dnn> c = b(dnn::new);
   public static final evd e = ddy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dnn> a() {
      return c;
   }

   public dnn(dra.d $$0) {
      super($$0, it.a, e, false);
   }

   @Override
   protected dhn c() {
      return (dhn)dea.oz;
   }
}
