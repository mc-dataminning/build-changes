import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfu extends dma {
   public static final MapCodec<dfu> a = b(dfu::new);
   public static final dte b = dta.R;

   @Override
   public MapCodec<dfu> a() {
      return a;
   }

   public dfu(dsj.d $$0) {
      super($$0);
      this.k(this.o().a(b, jf.c));
   }

   @Nullable
   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dpu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return !$$0.B ? a($$2, dpr.J, ($$0x, $$1x, $$2x, $$3) -> dxp.c.a($$0x, $$3.gq(), $$3.gr())) : null;
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
