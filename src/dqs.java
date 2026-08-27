import com.mojang.serialization.Codec;

public class dqs extends drg {
   private static final dqs c = new dqs();
   public static Codec<dqs> a = Codec.unit(() -> c);

   private dqs() {
   }

   public static dqs a() {
      return c;
   }

   @Override
   protected boolean a(drf $$0, apf $$1, gu $$2) {
      dre $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      he<cnk> $$4 = $$0.d().s($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public dri<?> b() {
      return dri.e;
   }
}
