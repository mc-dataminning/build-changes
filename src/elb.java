import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elb extends eli {
   public final awm<dea> a;
   public static final MapCodec<elb> b = awm.b(lf.f).xmap(elb::new, $$0 -> $$0.a).fieldOf("value");

   public elb(awm<dea> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ell.c a(dbc $$0, io $$1, io $$2, ell.c $$3, ell.c $$4, elh $$5) {
      return dzz.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected elk<?> a() {
      return elk.n;
   }
}
