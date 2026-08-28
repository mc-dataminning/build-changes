import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfm extends dls {
   public static final MapCodec<dfm> a = b(dfm::new);
   public static final dsw b = dss.R;

   @Override
   public MapCodec<dfm> a() {
      return a;
   }

   public dfm(dsb.d $$0) {
      super($$0);
      this.k(this.o().a(b, je.c));
   }

   @Nullable
   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dpm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return !$$0.B ? a($$2, dpj.J, ($$0x, $$1x, $$2x, $$3) -> dxe.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
