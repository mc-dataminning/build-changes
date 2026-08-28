import com.mojang.serialization.MapCodec;

public class ekt extends elh {
   private static final ekt c = new ekt();
   public static MapCodec<ekt> a = MapCodec.unit(() -> c);

   private ekt() {
   }

   public static ekt a() {
      return c;
   }

   @Override
   protected boolean a(elg $$0, azv $$1, jh $$2) {
      elf $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jq<dgh> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public elj<?> b() {
      return elj.e;
   }
}
