import com.mojang.serialization.MapCodec;

public class dfu extends cwj {
   public static final MapCodec<dfu> a = b(dfu::new);

   @Override
   public MapCodec<dfu> a() {
      return a;
   }

   public dfu(diz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      $$3.a($$0, new elm(0.25, 0.05F, 0.25));
   }
}
