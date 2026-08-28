import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elz extends emg {
   public final axe<dey> a;
   public static final MapCodec<elz> b = axe.b(lq.f).xmap(elz::new, $$0 -> $$0.a).fieldOf("value");

   public elz(axe<dey> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public emj.c a(dca $$0, iz $$1, iz $$2, emj.c $$3, emj.c $$4, emf $$5) {
      return eax.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected emi<?> a() {
      return emi.n;
   }
}
