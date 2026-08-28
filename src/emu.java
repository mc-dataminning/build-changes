import com.mojang.serialization.MapCodec;

public class emu extends eni {
   private static final emu c = new emu();
   public static MapCodec<emu> a = MapCodec.unit(() -> c);

   private emu() {
   }

   public static emu a() {
      return c;
   }

   @Override
   protected boolean a(enh $$0, bam $$1, jh $$2) {
      eng $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jq<dic> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public enk<?> b() {
      return enk.e;
   }
}
