import com.mojang.serialization.Codec;

public class dtr extends duf {
   private static final dtr c = new dtr();
   public static Codec<dtr> a = Codec.unit(() -> c);

   private dtr() {
   }

   public static dtr a() {
      return c;
   }

   @Override
   protected boolean a(due $$0, aru $$1, gu $$2) {
      dud $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      he<cqk> $$4 = $$0.d().s($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public duh<?> b() {
      return duh.e;
   }
}
