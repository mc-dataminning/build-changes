import com.mojang.serialization.MapCodec;

public class enc extends enq {
   private static final enc c = new enc();
   public static MapCodec<enc> a = MapCodec.unit(() -> c);

   private enc() {
   }

   public static enc a() {
      return c;
   }

   @Override
   protected boolean a(enp $$0, bam $$1, jh $$2) {
      eno $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jq<dik> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public ens<?> b() {
      return ens.e;
   }
}
