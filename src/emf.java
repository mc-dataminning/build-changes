import com.mojang.serialization.MapCodec;

public class emf extends emt {
   private static final emf c = new emf();
   public static MapCodec<emf> a = MapCodec.unit(() -> c);

   private emf() {
   }

   public static emf a() {
      return c;
   }

   @Override
   protected boolean a(ems $$0, azh $$1, ji $$2) {
      emr $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jr<dhl> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public emv<?> b() {
      return emv.e;
   }
}
