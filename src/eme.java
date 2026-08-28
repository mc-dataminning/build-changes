import com.mojang.serialization.MapCodec;

public class eme extends ems {
   private static final eme c = new eme();
   public static MapCodec<eme> a = MapCodec.unit(() -> c);

   private eme() {
   }

   public static eme a() {
      return c;
   }

   @Override
   protected boolean a(emr $$0, azh $$1, ji $$2) {
      emq $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jr<dhk> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public emu<?> b() {
      return emu.e;
   }
}
