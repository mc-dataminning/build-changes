import com.mojang.serialization.MapCodec;

public class dni extends dnm {
   public static final MapCodec<dni> a = b(dni::new);

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   public dni(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(dsd $$0, dbf $$1, iz $$2) {
      return false;
   }

   @Override
   protected int g(dsd $$0, dbf $$1, iz $$2) {
      return $$1.Q();
   }
}
