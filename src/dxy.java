import com.mojang.serialization.Codec;

public class dxy extends dym {
   private static final dxy c = new dxy();
   public static Codec<dxy> a = Codec.unit(() -> c);

   private dxy() {
   }

   public static dxy a() {
      return c;
   }

   @Override
   protected boolean a(dyl $$0, auv $$1, hx $$2) {
      dyk $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ih<cuo> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public dyo<?> b() {
      return dyo.e;
   }
}
