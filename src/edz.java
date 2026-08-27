import com.mojang.serialization.Codec;

public class edz extends een {
   private static final edz c = new edz();
   public static Codec<edz> a = Codec.unit(() -> c);

   private edz() {
   }

   public static edz a() {
      return c;
   }

   @Override
   protected boolean a(eem $$0, axr $$1, ib $$2) {
      eel $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      il<czw> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eep<?> b() {
      return eep.e;
   }
}
