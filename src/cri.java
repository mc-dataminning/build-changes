import javax.annotation.Nullable;

public abstract class cri extends csq {
   public static final int a = 3;
   public static final dfv b = dfu.r;

   protected cri(dfd.d $$0) {
      super($$0);
   }

   protected abstract Iterable<ehi> b(dfe var1);

   public static boolean c(dfe $$0) {
      return $$0.b(b) && ($$0.a(apo.ae) || $$0.a(apo.bj)) && $$0.c(b);
   }

   @Override
   public void a(cpq $$0, dfe $$1, ehe $$2, cch $$3) {
      if (!$$0.B && $$3.bM() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dfe $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(cpq $$0, ehi $$1, arx $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(ix.Z, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, aoz.dc, apa.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(ix.aD, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cbp $$0, dfe $$1, cpr $$2, gw $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof cri) {
         ((cri)$$1.b()).b($$1).forEach($$2x -> $$2.a(ix.Z, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, aoz.de, apa.e, 1.0F, 1.0F);
      $$2.a($$0, djo.c, $$3);
   }

   private static void a(cpr $$0, dfe $$1, gw $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }
}
