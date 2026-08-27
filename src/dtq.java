import com.mojang.serialization.Codec;

public class dtq extends due {
   private static final dtq c = new dtq();
   public static Codec<dtq> a = Codec.unit(() -> c);

   private dtq() {
   }

   public static dtq a() {
      return c;
   }

   @Override
   protected boolean a(dud $$0, aru $$1, gu $$2) {
      duc $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      he<cqj> $$4 = $$0.d().s($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public dug<?> b() {
      return dug.e;
   }
}
