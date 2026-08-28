import com.mojang.serialization.MapCodec;

public class ehi extends ehw {
   private static final ehi c = new ehi();
   public static MapCodec<ehi> a = MapCodec.unit(() -> c);

   private ehi() {
   }

   public static ehi a() {
      return c;
   }

   @Override
   protected boolean a(ehv $$0, aym $$1, ja $$2) {
      ehu $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jj<ddd> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public ehy<?> b() {
      return ehy.e;
   }
}
