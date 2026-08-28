import com.mojang.serialization.MapCodec;

public class ehd extends ehr {
   private static final ehd c = new ehd();
   public static MapCodec<ehd> a = MapCodec.unit(() -> c);

   private ehd() {
   }

   public static ehd a() {
      return c;
   }

   @Override
   protected boolean a(ehq $$0, azh $$1, iz $$2) {
      ehp $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ji<dcy> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eht<?> b() {
      return eht.e;
   }
}
