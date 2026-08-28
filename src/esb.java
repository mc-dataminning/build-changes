import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class esb extends esi {
   public final ayk<dkl> a;
   public static final MapCodec<esb> b = ayk.b(mb.f).xmap(esb::new, $$0 -> $$0.a).fieldOf("value");

   public esb(ayk<dkl> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public esl.d a(dhk $$0, jh $$1, jh $$2, esl.d $$3, esl.d $$4, esh $$5) {
      return egv.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected esk<?> a() {
      return esk.n;
   }
}
