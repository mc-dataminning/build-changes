import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eoy extends epf {
   public final axl<dhm> a;
   public static final MapCodec<eoy> b = axl.b(lw.f).xmap(eoy::new, $$0 -> $$0.a).fieldOf("value");

   public eoy(axl<dhm> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public epi.c a(dem $$0, jf $$1, jf $$2, epi.c $$3, epi.c $$4, epe $$5) {
      return edu.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected eph<?> a() {
      return eph.n;
   }
}
