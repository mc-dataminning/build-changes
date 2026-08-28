import com.mojang.serialization.MapCodec;

public class efo extends eff {
   public static final MapCodec<efo> b = dse.b.fieldOf("state").xmap(efo::new, $$0 -> $$0.c);
   private final dse c;

   protected efo(dse $$0) {
      this.c = $$0;
   }

   @Override
   protected efg<?> a() {
      return efg.a;
   }

   @Override
   public dse a(azh $$0, iz $$1) {
      return this.c;
   }
}
