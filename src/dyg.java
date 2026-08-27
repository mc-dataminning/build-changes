import com.mojang.serialization.Codec;

public class dyg extends dyu {
   private static final dyg c = new dyg();
   public static Codec<dyg> a = Codec.unit(() -> c);

   private dyg() {
   }

   public static dyg a() {
      return c;
   }

   @Override
   protected boolean a(dyt $$0, auw $$1, hx $$2) {
      dys $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ih<cuw> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public dyw<?> b() {
      return dyw.e;
   }
}
