import javax.annotation.Nullable;

public abstract class cru extends csk implements cii {
   public static final dgc a = dgb.w;
   private final czz.a b;

   public cru(czz.a $$0, dfk.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.C.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new deh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(csy.gO) || $$1.a(csy.gP) || $$1.a(csy.gQ) || $$1.a(csy.gR);
         if ($$3) {
            return a($$2, dcz.p, deh::a);
         }
      }

      return null;
   }

   public czz.a a() {
      return this.b;
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }

   @Override
   public bix g() {
      return bix.f;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }

   @Override
   public dfl a(clp $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
