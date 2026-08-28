import com.mojang.serialization.MapCodec;

public class eux extends eup {
   public static final MapCodec<eux> a = axr.a(mg.i).fieldOf("tag").xmap(eux::new, $$0 -> $$0.b);
   private final axr<dma> b;

   public eux(axr<dma> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dzz $$0, azv $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected euq<?> a() {
      return euq.d;
   }
}
