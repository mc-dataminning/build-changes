import com.mojang.serialization.MapCodec;

public class efh extends eey {
   public static final MapCodec<efh> b = drx.b.fieldOf("state").xmap(efh::new, $$0 -> $$0.c);
   private final drx c;

   protected efh(drx $$0) {
      this.c = $$0;
   }

   @Override
   protected eez<?> a() {
      return eez.a;
   }

   @Override
   public drx a(azc $$0, iz $$1) {
      return this.c;
   }
}
