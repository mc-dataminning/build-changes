import javax.annotation.Nullable;

public abstract class cre extends csm {
   public static final int a = 3;
   public static final dfr b = dfq.r;

   protected cre(dez.d $$0) {
      super($$0);
   }

   protected abstract Iterable<ehe> b(dfa var1);

   public static boolean c(dfa $$0) {
      return $$0.b(b) && ($$0.a(apl.ae) || $$0.a(apl.bj)) && $$0.c(b);
   }

   @Override
   public void a(cpm $$0, dfa $$1, eha $$2, ccf $$3) {
      if (!$$0.B && $$3.bM() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dfa $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(cpm $$0, ehe $$1, aru $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(iv.Z, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, aow.dc, aox.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(iv.aD, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cbn $$0, dfa $$1, cpn $$2, gu $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof cre) {
         ((cre)$$1.b()).b($$1).forEach($$2x -> $$2.a(iv.Z, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, aow.de, aox.e, 1.0F, 1.0F);
      $$2.a($$0, djk.c, $$3);
   }

   private static void a(cpn $$0, dfa $$1, gu $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }
}
