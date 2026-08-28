import com.mojang.serialization.MapCodec;

public class erj extends erz {
   public static final MapCodec<erj> a = dxo.a.fieldOf("block_state").xmap(erj::new, $$0 -> $$0.b);
   private final dxo b;

   public erj(dxo $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dxo $$0, bac $$1) {
      return $$0 == this.b;
   }

   @Override
   protected esa<?> a() {
      return esa.c;
   }
}
