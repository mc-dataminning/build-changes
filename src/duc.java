import com.mojang.serialization.Codec;

public class duc extends duq {
   private static final duc c = new duc();
   public static Codec<duc> a = Codec.unit(() -> c);

   private duc() {
   }

   public static duc a() {
      return c;
   }

   @Override
   protected boolean a(dup $$0, ase $$1, gw $$2) {
      duo $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      hg<cqv> $$4 = $$0.d().s($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public dus<?> b() {
      return dus.e;
   }
}
