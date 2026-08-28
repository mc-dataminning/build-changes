import com.mojang.serialization.MapCodec;

public class eli extends elz {
   public static final MapCodec<eli> a = lp.e.q().fieldOf("block").xmap(eli::new, $$0 -> $$0.b);
   private final deu b;

   public eli(deu $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(drx $$0, azc $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ema<?> a() {
      return ema.b;
   }
}
