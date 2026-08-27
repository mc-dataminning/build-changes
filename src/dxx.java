import com.mojang.serialization.Codec;

public class dxx extends dyl {
   private static final dxx c = new dxx();
   public static Codec<dxx> a = Codec.unit(() -> c);

   private dxx() {
   }

   public static dxx a() {
      return c;
   }

   @Override
   protected boolean a(dyk $$0, auu $$1, hx $$2) {
      dyj $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ih<cun> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public dyn<?> b() {
      return dyn.e;
   }
}
