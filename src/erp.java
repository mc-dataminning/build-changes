import com.mojang.serialization.MapCodec;

public class erp extends esf {
   public static final MapCodec<erp> a = dxu.a.fieldOf("block_state").xmap(erp::new, $$0 -> $$0.b);
   private final dxu b;

   public erp(dxu $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dxu $$0, bam $$1) {
      return $$0 == this.b;
   }

   @Override
   protected esg<?> a() {
      return esg.c;
   }
}
