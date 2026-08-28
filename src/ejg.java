import com.mojang.serialization.MapCodec;

public class ejg extends eju {
   private static final ejg c = new ejg();
   public static MapCodec<ejg> a = MapCodec.unit(() -> c);

   private ejg() {
   }

   public static ejg a() {
      return c;
   }

   @Override
   protected boolean a(ejt $$0, azk $$1, je $$2) {
      ejs $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jn<det> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public ejw<?> b() {
      return ejw.e;
   }
}
