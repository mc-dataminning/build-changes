import javax.annotation.Nullable;

public class csd extends csv implements czw {
   public static final dga a = dfz.C;

   protected csd(dfi.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Override
   public boolean c(dfj $$0, cpb $$1, gw $$2) {
      return true;
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.a;
   }

   @Override
   public float b(dfj $$0, cpb $$1, gw $$2) {
      return 1.0F;
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(a) ? ean.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().b_($$0.a()).a() == ean.c));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }

   @Override
   public cjf a(@Nullable cbu $$0, cpw $$1, gw $$2, dfj $$3) {
      return $$0 != null && $$0.f() ? czw.super.a($$0, $$1, $$2, $$3) : cjf.b;
   }

   @Override
   public boolean a(@Nullable cbu $$0, cpb $$1, gw $$2, dfj $$3, eal $$4) {
      return $$0 != null && $$0.f() ? czw.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
