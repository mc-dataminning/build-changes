import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class erd extends erk {
   public final axf<djl> a;
   public static final MapCodec<erd> b = axf.b(mc.f).xmap(erd::new, $$0 -> $$0.a).fieldOf("value");

   public erd(axf<djl> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ern.d a(dgk $$0, ji $$1, ji $$2, ern.d $$3, ern.d $$4, erj $$5) {
      return efx.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected erm<?> a() {
      return erm.n;
   }
}
