import com.mojang.serialization.MapCodec;

public class ehc extends ehq {
   private static final ehc c = new ehc();
   public static MapCodec<ehc> a = MapCodec.unit(() -> c);

   private ehc() {
   }

   public static ehc a() {
      return c;
   }

   @Override
   protected boolean a(ehp $$0, azh $$1, iz $$2) {
      eho $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ji<dcx> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public ehs<?> b() {
      return ehs.e;
   }
}
