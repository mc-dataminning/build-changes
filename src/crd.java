import javax.annotation.Nullable;

public abstract class crd extends csl {
   public static final int a = 3;
   public static final dfq b = dfp.r;

   protected crd(dey.d $$0) {
      super($$0);
   }

   protected abstract Iterable<ehd> b(dez var1);

   public static boolean c(dez $$0) {
      return $$0.b(b) && ($$0.a(apl.ae) || $$0.a(apl.bj)) && $$0.c(b);
   }

   @Override
   public void a(cpl $$0, dez $$1, egz $$2, cce $$3) {
      if (!$$0.B && $$3.bM() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dez $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(cpl $$0, ehd $$1, aru $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(iv.Z, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, aow.dc, aox.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(iv.aD, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cbm $$0, dez $$1, cpm $$2, gu $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof crd) {
         ((crd)$$1.b()).b($$1).forEach($$2x -> $$2.a(iv.Z, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, aow.de, aox.e, 1.0F, 1.0F);
      $$2.a($$0, djj.c, $$3);
   }

   private static void a(cpm $$0, dez $$1, gu $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }
}
