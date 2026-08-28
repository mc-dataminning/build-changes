import com.google.common.annotations.VisibleForTesting;

public class dql extends dpf implements dwv.b<dql.a> {
   private final dql.a a;

   public dql(iz $$0, dsa $$1) {
      super(dph.K, $$0, $$1);
      this.a = new dql.a($$1, new dwp($$0));
   }

   public static void a(dbw $$0, iz $$1, dsa $$2, dql $$3) {
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

   public dql.a b() {
      return this.a;
   }

   public static class a implements dwv {
      public static final int a = 8;
      final dls b;
      private final dsa c;
      private final dwx d;

      public a(dsa $$0, dwx $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dls.a();
      }

      @Override
      public dwx a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dwv.a c() {
         return dwv.a.b;
      }

      @Override
      public boolean a(are $$0, ji<dwt> $$1, dwt.a $$2, evp $$3) {
         if ($$1.a(dwt.p) && $$2.a() instanceof btn $$4) {
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
      public dls d() {
         return this.b;
      }

      private void a(are $$0, iz $$1, dsa $$2, azf $$3) {
         $$0.a($$1, $$2.a(dlp.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(li.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, avz.vX, awa.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dbw $$0, btn $$1) {
         if ($$1.em() instanceof arf $$3) {
            brl $$4 = $$1.eC() == null ? $$0.aj().a((cmv)$$3) : $$1.eC();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}
