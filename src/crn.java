import javax.annotation.Nullable;

public abstract class crn extends csv {
   public static final int a = 3;
   public static final dga b = dfz.r;

   protected crn(dfi.d $$0) {
      super($$0);
   }

   protected abstract Iterable<ehn> b(dfj var1);

   public static boolean c(dfj $$0) {
      return $$0.b(b) && ($$0.a(apt.ae) || $$0.a(apt.bj)) && $$0.c(b);
   }

   @Override
   public void a(cpv $$0, dfj $$1, ehj $$2, ccm $$3) {
      if (!$$0.B && $$3.bN() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dfj $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(cpv $$0, ehn $$1, asc $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(ix.Z, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, ape.dc, apf.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(ix.aD, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cbu $$0, dfj $$1, cpw $$2, gw $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof crn) {
         ((crn)$$1.b()).b($$1).forEach($$2x -> $$2.a(ix.Z, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, ape.de, apf.e, 1.0F, 1.0F);
      $$2.a($$0, djt.c, $$3);
   }

   private static void a(cpw $$0, dfj $$1, gw $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }
}
