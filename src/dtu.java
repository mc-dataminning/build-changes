import com.mojang.serialization.Codec;

public class dtu extends dui {
   private static final dtu c = new dtu();
   public static Codec<dtu> a = Codec.unit(() -> c);

   private dtu() {
   }

   public static dtu a() {
      return c;
   }

   @Override
   protected boolean a(duh $$0, ash $$1, gw $$2) {
      dug $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      he<cqz> $$4 = $$0.d().s($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public duk<?> b() {
      return duk.e;
   }
}
