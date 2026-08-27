import com.mojang.serialization.Codec;

public class eey extends efm {
   private static final eey c = new eey();
   public static Codec<eey> a = Codec.unit(() -> c);

   private eey() {
   }

   public static eey a() {
      return c;
   }

   @Override
   protected boolean a(efl $$0, ayd $$1, im $$2) {
      efk $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      iv<dat> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public efo<?> b() {
      return efo.e;
   }
}
