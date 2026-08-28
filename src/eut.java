import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eut extends eva {
   public final axr<dmf> a;
   public static final MapCodec<eut> b = axr.b(mg.i).xmap(eut::new, $$0 -> $$0.a).fieldOf("value");

   public eut(axr<dmf> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public evd.d a(djd $$0, iu $$1, iu $$2, evd.d $$3, evd.d $$4, euz $$5) {
      return ejm.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected evc<?> a() {
      return evc.n;
   }
}
