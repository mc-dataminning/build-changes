import com.mojang.serialization.MapCodec;

public class enb extends enp {
   private static final enb c = new enb();
   public static MapCodec<enb> a = MapCodec.unit(() -> c);

   private enb() {
   }

   public static enb a() {
      return c;
   }

   @Override
   protected boolean a(eno $$0, bam $$1, jh $$2) {
      enn $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jq<dij> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public enr<?> b() {
      return enr.e;
   }
}
