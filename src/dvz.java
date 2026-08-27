import com.mojang.serialization.Codec;

public class dvz extends dwn {
   private static final dvz c = new dvz();
   public static Codec<dvz> a = Codec.unit(() -> c);

   private dvz() {
   }

   public static dvz a() {
      return c;
   }

   @Override
   protected boolean a(dwm $$0, ats $$1, ht $$2) {
      dwl $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ib<csy> $$4 = $$0.d().s($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public dwp<?> b() {
      return dwp.e;
   }
}
