import com.mojang.serialization.Codec;

public class dzw extends eak {
   private static final dzw c = new dzw();
   public static Codec<dzw> a = Codec.unit(() -> c);

   private dzw() {
   }

   public static dzw a() {
      return c;
   }

   @Override
   protected boolean a(eaj $$0, awo $$1, hz $$2) {
      eai $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ij<cwm> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eam<?> b() {
      return eam.e;
   }
}
