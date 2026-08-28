import com.mojang.serialization.MapCodec;

public class erp extends erh {
   public static final MapCodec<erp> a = axf.a(mc.f).fieldOf("tag").xmap(erp::new, $$0 -> $$0.b);
   private final axf<djl> b;

   public erp(axf<djl> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dww $$0, azh $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eri<?> a() {
      return eri.d;
   }
}
