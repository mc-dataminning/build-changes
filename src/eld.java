import com.mojang.serialization.MapCodec;

public class eld extends eku {
   public static final MapCodec<eld> b = dxo.a.fieldOf("state").xmap(eld::new, $$0 -> $$0.c);
   private final dxo c;

   protected eld(dxo $$0) {
      this.c = $$0;
   }

   @Override
   protected ekv<?> a() {
      return ekv.a;
   }

   @Override
   public dxo a(bac $$0, jh $$1) {
      return this.c;
   }
}
