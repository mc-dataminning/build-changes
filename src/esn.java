import com.mojang.serialization.MapCodec;

public class esn extends esf {
   public static final MapCodec<esn> a = axf.a(mc.f).fieldOf("tag").xmap(esn::new, $$0 -> $$0.b);
   private final axf<dke> b;

   public esn(axf<dke> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dxq $$0, azh $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected esg<?> a() {
      return esg.d;
   }
}
