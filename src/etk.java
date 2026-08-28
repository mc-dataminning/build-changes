import com.mojang.serialization.MapCodec;

public class etk extends etc {
   public static final MapCodec<etk> a = axp.a(me.f).fieldOf("tag").xmap(etk::new, $$0 -> $$0.b);
   private final axp<dku> b;

   public etk(axp<dku> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dym $$0, azs $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected etd<?> a() {
      return etd.d;
   }
}
