import com.mojang.serialization.Codec;

public class eik extends eiz {
   private static final eik c = new eik();
   public static Codec<eik> a = Codec.unit(() -> c);

   private eik() {
   }

   public static eik a() {
      return c;
   }

   @Override
   protected boolean a(eiy $$0, ayt $$1, ir $$2) {
      eix $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ja<dcz> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public ejb<?> b() {
      return ejb.e;
   }
}
