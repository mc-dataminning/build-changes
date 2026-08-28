import com.mojang.serialization.MapCodec;

public class elk extends elz {
   public static final MapCodec<elk> a = drx.b.fieldOf("block_state").xmap(elk::new, $$0 -> $$0.b);
   private final drx b;

   public elk(drx $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(drx $$0, azc $$1) {
      return $$0 == this.b;
   }

   @Override
   protected ema<?> a() {
      return ema.c;
   }
}
