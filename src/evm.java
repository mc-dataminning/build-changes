import com.mojang.serialization.MapCodec;

public class evm extends eve {
   public static final MapCodec<evm> a = axr.a(mh.i).fieldOf("tag").xmap(evm::new, $$0 -> $$0.b);
   private final axr<dmm> b;

   public evm(axr<dmm> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(eao $$0, azv $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected evf<?> a() {
      return evf.d;
   }
}
