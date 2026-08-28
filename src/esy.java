import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class esy extends etf {
   public final axp<dku> a;
   public static final MapCodec<esy> b = axp.b(me.f).xmap(esy::new, $$0 -> $$0.a).fieldOf("value");

   public esy(axp<dku> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public eti.d a(dhs $$0, jj $$1, jj $$2, eti.d $$3, eti.d $$4, ete $$5) {
      return ehr.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected eth<?> a() {
      return eth.n;
   }
}
