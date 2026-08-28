import com.google.common.annotations.VisibleForTesting;

public class dqm extends dpg implements dww.b<dqm.a> {
   private final dqm.a a;

   public dqm(iz $$0, dsb $$1) {
      super(dpi.K, $$0, $$1);
      this.a = new dqm.a($$1, new dwq($$0));
   }

   public static void a(dbx $$0, iz $$1, dsb $$2, dqm $$3) {
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

   public dqm.a b() {
      return this.a;
   }

   public static class a implements dww {
      public static final int a = 8;
      final dlt b;
      private final dsb c;
      private final dwy d;

      public a(dsb $$0, dwy $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dlt.a();
      }

      @Override
      public dwy a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dww.a c() {
         return dww.a.b;
      }

      @Override
      public boolean a(are $$0, ji<dwu> $$1, dwu.a $$2, evq $$3) {
         if ($$1.a(dwu.p) && $$2.a() instanceof bto $$4) {
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
      public dlt d() {
         return this.b;
      }

      private void a(are $$0, iz $$1, dsb $$2, azg $$3) {
         $$0.a($$1, $$2.a(dlq.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(li.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, avz.vX, awa.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dbx $$0, bto $$1) {
         if ($$1.em() instanceof arf $$3) {
            brm $$4 = $$1.eC() == null ? $$0.aj().a((cmw)$$3) : $$1.eC();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}
