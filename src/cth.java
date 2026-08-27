import javax.annotation.Nullable;

public class cth extends czo {
   public static final dgd a = dfz.R;

   public cth(dfi.d $$0) {
      super($$0);
      this.k(this.n().a(a, hc.c));
   }

   @Nullable
   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new dda($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return !$$0.B ? a($$2, dcx.J, ($$0x, $$1x, $$2x, $$3) -> dkc.c.a($$0x, $$3.gf(), $$3.gg())) : null;
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      return super.a($$0).a(a, $$0.g());
   }

   @Override
   public int a(dfj $$0, cpb $$1, gw $$2, hc $$3) {
      return $$3 != $$0.c(a) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      super.a($$0);
      $$0.a(a);
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   public int b() {
      return 10;
   }
}
