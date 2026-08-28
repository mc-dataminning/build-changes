import com.mojang.serialization.MapCodec;

public class erp extends esf {
   public static final MapCodec<erp> a = dxq.a.fieldOf("block_state").xmap(erp::new, $$0 -> $$0.b);
   private final dxq b;

   public erp(dxq $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dxq $$0, azh $$1) {
      return $$0 == this.b;
   }

   @Override
   protected esg<?> a() {
      return esg.c;
   }
}
