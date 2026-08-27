import com.mojang.serialization.Codec;

public class eei extends eew {
   private static final eei c = new eei();
   public static Codec<eei> a = Codec.unit(() -> c);

   private eei() {
   }

   public static eei a() {
      return c;
   }

   @Override
   protected boolean a(eev $$0, axt $$1, id $$2) {
      eeu $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      in<daf> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eey<?> b() {
      return eey.e;
   }
}
