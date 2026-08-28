import com.mojang.serialization.MapCodec;

public class emk extends emc {
   public static final MapCodec<emk> a = axe.a(lq.f).fieldOf("tag").xmap(emk::new, $$0 -> $$0.b);
   private final axe<dex> b;

   public emk(axe<dex> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsa $$0, azf $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected emd<?> a() {
      return emd.d;
   }
}
