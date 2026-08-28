import com.mojang.serialization.MapCodec;

public class dnh extends dnl {
   public static final MapCodec<dnh> a = b(dnh::new);

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   public dnh(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(dsc $$0, dbe $$1, iz $$2) {
      return false;
   }

   @Override
   protected int g(dsc $$0, dbe $$1, iz $$2) {
      return $$1.Q();
   }
}
