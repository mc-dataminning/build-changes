import com.google.common.annotations.VisibleForTesting;

public class dpm extends dog implements dvw.b<dpm.a> {
   private final dpm.a a;

   public dpm(io $$0, drb $$1) {
      super(doi.K, $$0, $$1);
      this.a = new dpm.a($$1, new dvq($$0));
   }

   public static void a(dax $$0, io $$1, drb $$2, dpm $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dpm.a b() {
      return this.a;
   }

   public static class a implements dvw {
      public static final int a = 8;
      final dkt b;
      private final drb c;
      private final dvy d;

      public a(drb $$0, dvy $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dkt.a();
      }

      @Override
      public dvy a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dvw.a c() {
         return dvw.a.b;
      }

      @Override
      public boolean a(aqm $$0, ix<dvu> $$1, dvu.a $$2, euk $$3) {
         if ($$1.a(dvu.p) && $$2.a() instanceof bso $$4) {
            if (!$$4.eI()) {
               int $$5 = $$4.ej();
               if ($$4.eh() && $$5 > 0) {
                  this.b.a(io.a($$3.a(it.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eH();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, io.a($$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dkt d() {
         return this.b;
      }

      private void a(aqm $$0, io $$1, drb $$2, ayk $$3) {
         $$0.a($$1, $$2.a(dkq.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(ky.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, avh.vX, avi.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dax $$0, bso $$1) {
         if ($$1.em() instanceof aqn $$3) {
            bqn $$4 = $$1.eC() == null ? $$0.ai().a((clw)$$3) : $$1.eC();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}
