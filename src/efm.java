import com.mojang.serialization.MapCodec;

public class efm extends efd {
   public static final MapCodec<efm> b = dsc.b.fieldOf("state").xmap(efm::new, $$0 -> $$0.c);
   private final dsc c;

   protected efm(dsc $$0) {
      this.c = $$0;
   }

   @Override
   protected efe<?> a() {
      return efe.a;
   }

   @Override
   public dsc a(azh $$0, iz $$1) {
      return this.c;
   }
}
