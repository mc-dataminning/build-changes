import com.mojang.serialization.MapCodec;

public class doh extends dol {
   public static final MapCodec<doh> a = b(doh::new);

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   public doh(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(dtc $$0, dcc $$1, jd $$2) {
      return false;
   }

   @Override
   protected int g(dtc $$0, dcc $$1, jd $$2) {
      return $$1.Q();
   }
}
