import com.mojang.serialization.MapCodec;

public class efn extends efe {
   public static final MapCodec<efn> b = dsd.b.fieldOf("state").xmap(efn::new, $$0 -> $$0.c);
   private final dsd c;

   protected efn(dsd $$0) {
      this.c = $$0;
   }

   @Override
   protected eff<?> a() {
      return eff.a;
   }

   @Override
   public dsd a(azh $$0, iz $$1) {
      return this.c;
   }
}
