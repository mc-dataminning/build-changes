import com.mojang.serialization.MapCodec;

public class emv extends enj {
   private static final emv c = new emv();
   public static MapCodec<emv> a = MapCodec.unit(() -> c);

   private emv() {
   }

   public static emv a() {
      return c;
   }

   @Override
   protected boolean a(eni $$0, bac $$1, jh $$2) {
      enh $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jq<dib> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public enl<?> b() {
      return enl.e;
   }
}
