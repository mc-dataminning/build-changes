import com.mojang.serialization.MapCodec;

public class erh extends erz {
   public static final MapCodec<erh> a = ma.e.q().fieldOf("block").xmap(erh::new, $$0 -> $$0.b);
   private final dkd b;

   public erh(dkd $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dxo $$0, bac $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected esa<?> a() {
      return esa.b;
   }
}
