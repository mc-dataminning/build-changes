import com.mojang.serialization.Codec;

public class ebu extends eci {
   private static final ebu c = new ebu();
   public static Codec<ebu> a = Codec.unit(() -> c);

   private ebu() {
   }

   public static ebu a() {
      return c;
   }

   @Override
   protected boolean a(ech $$0, axd $$1, ib $$2) {
      ecg $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      il<cxy> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eck<?> b() {
      return eck.e;
   }
}
