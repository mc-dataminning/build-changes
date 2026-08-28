import com.mojang.serialization.MapCodec;

public class eju extends eki {
   private static final eju c = new eju();
   public static MapCodec<eju> a = MapCodec.unit(() -> c);

   private eju() {
   }

   public static eju a() {
      return c;
   }

   @Override
   protected boolean a(ekh $$0, azl $$1, je $$2) {
      ekg $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jn<dfh> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public ekk<?> b() {
      return ekk.e;
   }
}
