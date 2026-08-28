import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ere extends erl {
   public final axf<djm> a;
   public static final MapCodec<ere> b = axf.b(mc.f).xmap(ere::new, $$0 -> $$0.a).fieldOf("value");

   public ere(axf<djm> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ero.d a(dgl $$0, ji $$1, ji $$2, ero.d $$3, ero.d $$4, erk $$5) {
      return efy.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ern<?> a() {
      return ern.n;
   }
}
