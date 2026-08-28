import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class esc extends esj {
   public final ayk<dkm> a;
   public static final MapCodec<esc> b = ayk.b(mb.f).xmap(esc::new, $$0 -> $$0.a).fieldOf("value");

   public esc(ayk<dkm> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public esm.d a(dhl $$0, jh $$1, jh $$2, esm.d $$3, esm.d $$4, esi $$5) {
      return egw.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected esl<?> a() {
      return esl.n;
   }
}
