import com.mojang.serialization.Codec;

public class dus extends dvg {
   private static final dus c = new dus();
   public static Codec<dus> a = Codec.unit(() -> c);

   private dus() {
   }

   public static dus a() {
      return c;
   }

   @Override
   protected boolean a(dvf $$0, ate $$1, ht $$2) {
      dve $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ib<crx> $$4 = $$0.d().s($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public dvi<?> b() {
      return dvi.e;
   }
}
