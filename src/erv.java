import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class erv extends esc {
   public final aya<dkd> a;
   public static final MapCodec<erv> b = aya.b(mb.f).xmap(erv::new, $$0 -> $$0.a).fieldOf("value");

   public erv(aya<dkd> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public esf.d a(dhc $$0, jh $$1, jh $$2, esf.d $$3, esf.d $$4, esb $$5) {
      return egp.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ese<?> a() {
      return ese.n;
   }
}
