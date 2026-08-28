import com.mojang.serialization.MapCodec;

public class emh extends elz {
   public static final MapCodec<emh> a = axb.a(lq.f).fieldOf("tag").xmap(emh::new, $$0 -> $$0.b);
   private final axb<deu> b;

   public emh(axb<deu> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(drx $$0, azc $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ema<?> a() {
      return ema.d;
   }
}
