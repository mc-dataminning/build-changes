import com.mojang.serialization.MapCodec;

public class djn extends djo {
   public static final MapCodec<djn> a = b(djn::new);
   private static final fcr c = dke.b(12.0, 0.0, 15.0);

   @Override
   public MapCodec<djn> a() {
      return a;
   }

   protected djn(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return c;
   }
}
