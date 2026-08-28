import com.mojang.serialization.MapCodec;

public class efm extends eff {
   public static final MapCodec<efm> b = dse.b.fieldOf("state").xmap(dsd.a::b, dfb::o).xmap(efm::new, $$0 -> $$0.c);
   private final dfb c;

   public efm(dfb $$0) {
      this.c = $$0;
   }

   @Override
   protected efg<?> a() {
      return efg.f;
   }

   @Override
   public dse a(azh $$0, iz $$1) {
      je.a $$2 = je.a.a($$0);
      return this.c.o().a(dln.i, $$2);
   }
}
