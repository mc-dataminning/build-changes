import com.mojang.serialization.Codec;

public class dwe extends dws {
   private static final dwe c = new dwe();
   public static Codec<dwe> a = Codec.unit(() -> c);

   private dwe() {
   }

   public static dwe a() {
      return c;
   }

   @Override
   protected boolean a(dwr $$0, atw $$1, hx $$2) {
      dwq $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ig<ctd> $$4 = $$0.d().s($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public dwu<?> b() {
      return dwu.e;
   }
}
