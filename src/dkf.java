import com.mojang.serialization.MapCodec;

public class dkf extends dkj {
   public static final MapCodec<dkf> a = b(dkf::new);

   @Override
   public MapCodec<dkf> a() {
      return a;
   }

   public dkf(doy.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(doz $$0, cyd $$1, ib $$2) {
      return false;
   }

   @Override
   protected int g(doz $$0, cyd $$1, ib $$2) {
      return $$1.P();
   }
}
