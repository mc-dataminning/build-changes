import com.mojang.serialization.MapCodec;

public class djm extends djo {
   public static final MapCodec<djm> a = b(djm::new);
   private static final fcr c = dke.b(12.0, 0.0, 4.0);

   @Override
   public MapCodec<? extends djm> a() {
      return a;
   }

   protected djm(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return c;
   }
}
