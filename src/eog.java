import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eog extends eon {
   public final axi<dgv> a;
   public static final MapCodec<eog> b = axi.b(lv.f).xmap(eog::new, $$0 -> $$0.a).fieldOf("value");

   public eog(axi<dgv> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public eoq.c a(ddv $$0, je $$1, je $$2, eoq.c $$3, eoq.c $$4, eom $$5) {
      return edc.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected eop<?> a() {
      return eop.n;
   }
}
