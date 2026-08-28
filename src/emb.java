import com.mojang.serialization.MapCodec;

public class emb extends ems {
   public static final MapCodec<emb> a = lq.e.r().fieldOf("block").xmap(emb::new, $$0 -> $$0.b);
   private final dfi b;

   public emb(dfi $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsl $$0, ayo $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected emt<?> a() {
      return emt.b;
   }
}
