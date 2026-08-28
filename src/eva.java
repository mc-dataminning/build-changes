import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eva extends evh {
   public final axr<dmm> a;
   public static final MapCodec<eva> b = axr.b(mh.i).xmap(eva::new, $$0 -> $$0.a).fieldOf("value");

   public eva(axr<dmm> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public evk.d a(djk $$0, iv $$1, iv $$2, evk.d $$3, evk.d $$4, evg $$5) {
      return ejt.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected evj<?> a() {
      return evj.n;
   }
}
