import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class erc extends erj {
   public final axe<djk> a;
   public static final MapCodec<erc> b = axe.b(mc.f).xmap(erc::new, $$0 -> $$0.a).fieldOf("value");

   public erc(axe<djk> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public erm.d a(dgj $$0, ji $$1, ji $$2, erm.d $$3, erm.d $$4, eri $$5) {
      return efw.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected erl<?> a() {
      return erl.n;
   }
}
