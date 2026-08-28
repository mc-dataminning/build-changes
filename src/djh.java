import com.mojang.serialization.MapCodec;

public class djh extends dds {
   public static final MapCodec<djh> d = b(djh::new);

   @Override
   public MapCodec<djh> a() {
      return d;
   }

   public djh(dsb.d $$0) {
      super($$0, kf.e);
   }

   @Override
   protected double b(dsc $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dsc $$0) {
      return true;
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aA();
      }
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      return 3;
   }
}
