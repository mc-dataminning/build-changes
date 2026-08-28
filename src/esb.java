import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class esb extends esi {
   public final axf<dke> a;
   public static final MapCodec<esb> b = axf.b(mc.f).xmap(esb::new, $$0 -> $$0.a).fieldOf("value");

   public esb(axf<dke> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public esl.d a(dhc $$0, ji $$1, ji $$2, esl.d $$3, esl.d $$4, esh $$5) {
      return egu.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected esk<?> a() {
      return esk.n;
   }
}
