import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eqa extends eqh {
   public final axs<diq> a;
   public static final MapCodec<eqa> b = axs.b(ma.f).xmap(eqa::new, $$0 -> $$0.a).fieldOf("value");

   public eqa(axs<diq> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public eqk.c a(dfp $$0, jh $$1, jh $$2, eqk.c $$3, eqk.c $$4, eqg $$5) {
      return eew.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected eqj<?> a() {
      return eqj.n;
   }
}
