import com.mojang.serialization.Codec;

public class dtp extends dud {
   private static final dtp c = new dtp();
   public static Codec<dtp> a = Codec.unit(() -> c);

   private dtp() {
   }

   public static dtp a() {
      return c;
   }

   @Override
   protected boolean a(duc $$0, art $$1, gv $$2) {
      dub $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      hf<cqi> $$4 = $$0.d().s($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public duf<?> b() {
      return duf.e;
   }
}
