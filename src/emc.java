import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class emc extends emj {
   public final axf<dfb> a;
   public static final MapCodec<emc> b = axf.b(lq.f).xmap(emc::new, $$0 -> $$0.a).fieldOf("value");

   public emc(axf<dfb> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public emm.c a(dcd $$0, iz $$1, iz $$2, emm.c $$3, emm.c $$4, emi $$5) {
      return eba.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected eml<?> a() {
      return eml.n;
   }
}
