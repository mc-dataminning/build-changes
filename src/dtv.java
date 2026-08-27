import com.mojang.serialization.Codec;

public class dtv extends duj {
   private static final dtv c = new dtv();
   public static Codec<dtv> a = Codec.unit(() -> c);

   private dtv() {
   }

   public static dtv a() {
      return c;
   }

   @Override
   protected boolean a(dui $$0, arx $$1, gw $$2) {
      duh $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      hg<cqo> $$4 = $$0.d().s($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public dul<?> b() {
      return dul.e;
   }
}
