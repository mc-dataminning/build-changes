import com.mojang.serialization.MapCodec;

public class dml extends dhm {
   public static final MapCodec<dml> a = b(dml::new);
   protected static final ezq b = dhm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   public dml(dur.d $$0) {
      super($$0);
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   protected ezq b_(dus $$0, ddo $$1, jf $$2) {
      return ezn.b();
   }

   @Override
   protected ezq c(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return ezn.b();
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   @Override
   protected float c(dus $$0, ddo $$1, jf $$2) {
      return 0.2F;
   }
}
