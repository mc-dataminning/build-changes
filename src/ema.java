import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ema extends emh {
   public final axf<dez> a;
   public static final MapCodec<ema> b = axf.b(lq.f).xmap(ema::new, $$0 -> $$0.a).fieldOf("value");

   public ema(axf<dez> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public emk.c a(dcb $$0, iz $$1, iz $$2, emk.c $$3, emk.c $$4, emg $$5) {
      return eay.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected emj<?> a() {
      return emj.n;
   }
}
