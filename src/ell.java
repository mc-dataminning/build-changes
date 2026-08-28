import com.mojang.serialization.MapCodec;

public class ell extends emc {
   public static final MapCodec<ell> a = lp.e.q().fieldOf("block").xmap(ell::new, $$0 -> $$0.b);
   private final dex b;

   public ell(dex $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsa $$0, azf $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected emd<?> a() {
      return emd.b;
   }
}
