import javax.annotation.Nullable;

public abstract class crs extends csi implements cig {
   public static final dga a = dfz.w;
   private final czx.a b;

   public crs(czx.a $$0, dfi.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.C.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new def($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(csw.gO) || $$1.a(csw.gP) || $$1.a(csw.gQ) || $$1.a(csw.gR);
         if ($$3) {
            return a($$2, dcx.p, def::a);
         }
      }

      return null;
   }

   public czx.a a() {
      return this.b;
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }

   @Override
   public biv g() {
      return biv.f;
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }

   @Override
   public dfj a(cln $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
