import com.mojang.serialization.MapCodec;

public class etx extends eup {
   public static final MapCodec<etx> a = mf.e.q().fieldOf("block").xmap(etx::new, $$0 -> $$0.b);
   private final dma b;

   public etx(dma $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dzz $$0, azv $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected euq<?> a() {
      return euq.b;
   }
}
