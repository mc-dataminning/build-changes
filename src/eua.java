import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eua extends euh {
   public final axp<dlu> a;
   public static final MapCodec<eua> b = axp.b(mg.i).xmap(eua::new, $$0 -> $$0.a).fieldOf("value");

   public eua(axp<dlu> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public euk.d a(dis $$0, iu $$1, iu $$2, euk.d $$3, euk.d $$4, eug $$5) {
      return eit.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected euj<?> a() {
      return euj.n;
   }
}
