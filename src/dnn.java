import com.mojang.serialization.MapCodec;

public class dnn extends dnr {
   public static final MapCodec<dnn> a = b(dnn::new);

   @Override
   public MapCodec<dnn> a() {
      return a;
   }

   public dnn(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(dsh $$0, dbj $$1, ja $$2) {
      return false;
   }

   @Override
   protected int g(dsh $$0, dbj $$1, ja $$2) {
      return $$1.Q();
   }
}
