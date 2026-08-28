import com.mojang.serialization.MapCodec;

public class ehe extends ehs {
   private static final ehe c = new ehe();
   public static MapCodec<ehe> a = MapCodec.unit(() -> c);

   private ehe() {
   }

   public static ehe a() {
      return c;
   }

   @Override
   protected boolean a(ehr $$0, azh $$1, iz $$2) {
      ehq $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ji<dcz> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public ehu<?> b() {
      return ehu.e;
   }
}
