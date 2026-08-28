import com.mojang.serialization.MapCodec;

public class emd extends emr {
   private static final emd c = new emd();
   public static MapCodec<emd> a = MapCodec.unit(() -> c);

   private emd() {
   }

   public static emd a() {
      return c;
   }

   @Override
   protected boolean a(emq $$0, azh $$1, ji $$2) {
      emp $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jr<dhj> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public emt<?> b() {
      return emt.e;
   }
}
