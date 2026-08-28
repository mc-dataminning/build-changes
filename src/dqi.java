import com.google.common.annotations.VisibleForTesting;

public class dqi extends dpc implements dws.b<dqi.a> {
   private final dqi.a a;

   public dqi(iz $$0, drx $$1) {
      super(dpe.K, $$0, $$1);
      this.a = new dqi.a($$1, new dwm($$0));
   }

   public static void a(dbt $$0, iz $$1, drx $$2, dqi $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dqi.a b() {
      return this.a;
   }

   public static class a implements dws {
      public static final int a = 8;
      final dlp b;
      private final drx c;
      private final dwu d;

      public a(drx $$0, dwu $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dlp.a();
      }

      @Override
      public dwu a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dws.a c() {
         return dws.a.b;
      }

      @Override
      public boolean a(arb $$0, ji<dwq> $$1, dwq.a $$2, evm $$3) {
         if ($$1.a(dwq.p) && $$2.a() instanceof btk $$4) {
            if (!$$4.eI()) {
               int $$5 = $$4.ej();
               if ($$4.eh() && $$5 > 0) {
                  this.b.a(iz.a($$3.a(je.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eH();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, iz.a($$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dlp d() {
         return this.b;
      }

      private void a(arb $$0, iz $$1, drx $$2, azc $$3) {
         $$0.a($$1, $$2.a(dlm.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lj.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, avw.vX, avx.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dbt $$0, btk $$1) {
         if ($$1.em() instanceof arc $$3) {
            bri $$4 = $$1.eC() == null ? $$0.aj().a((cms)$$3) : $$1.eC();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}
