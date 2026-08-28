import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class erf extends erm {
   public final axf<djn> a;
   public static final MapCodec<erf> b = axf.b(mc.f).xmap(erf::new, $$0 -> $$0.a).fieldOf("value");

   public erf(axf<djn> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public erp.d a(dgm $$0, ji $$1, ji $$2, erp.d $$3, erp.d $$4, erl $$5) {
      return efz.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ero<?> a() {
      return ero.n;
   }
}
