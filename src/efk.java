import com.mojang.serialization.MapCodec;

public class efk extends efb {
   public static final MapCodec<efk> b = dsa.b.fieldOf("state").xmap(efk::new, $$0 -> $$0.c);
   private final dsa c;

   protected efk(dsa $$0) {
      this.c = $$0;
   }

   @Override
   protected efc<?> a() {
      return efc.a;
   }

   @Override
   public dsa a(azf $$0, iz $$1) {
      return this.c;
   }
}
