import com.mojang.serialization.Codec;

public class eay extends ebm {
   private static final eay c = new eay();
   public static Codec<eay> a = Codec.unit(() -> c);

   private eay() {
   }

   public static eay a() {
      return c;
   }

   @Override
   protected boolean a(ebl $$0, awt $$1, ib $$2) {
      ebk $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      il<cxd> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public ebo<?> b() {
      return ebo.e;
   }
}
