import com.mojang.serialization.Codec;

public class dxg extends dxu {
   private static final dxg c = new dxg();
   public static Codec<dxg> a = Codec.unit(() -> c);

   private dxg() {
   }

   public static dxg a() {
      return c;
   }

   @Override
   protected boolean a(dxt $$0, auf $$1, hv $$2) {
      dxs $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ie<ctx> $$4 = $$0.d().s($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public dxw<?> b() {
      return dxw.e;
   }
}
