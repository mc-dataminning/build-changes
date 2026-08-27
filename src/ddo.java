import com.google.common.annotations.VisibleForTesting;

public class ddo extends dck implements djk.b<ddo.a> {
   private final ddo.a a;

   public ddo(gv $$0, dey $$1) {
      super(dcm.K, $$0, $$1);
      this.a = new ddo.a($$1, new dje($$0));
   }

   public static void a(cpk $$0, gv $$1, dey $$2, ddo $$3) {
      $$3.a.d().a($$0, $$1, $$0.y_(), true);
   }

   @Override
   public void a(qs $$0) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(qs $$0) {
      this.a.b.b($$0);
      super.b($$0);
   }

   public ddo.a c() {
      return this.a;
   }

   public static class a implements djk {
      public static final int a = 8;
      final czf b;
      private final dey c;
      private final djm d;

      public a(dey $$0, djm $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = czf.a();
      }

      @Override
      public djm a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public djk.a c() {
         return djk.a.b;
      }

      @Override
      public boolean a(aki $$0, dji $$1, dji.a $$2, ehf $$3) {
         if ($$1 == dji.p && $$2.a() instanceof biw $$4) {
            if (!$$4.eB()) {
               int $$5 = $$4.ec();
               if ($$4.ea() && $$5 > 0) {
                  this.b.a(gv.a($$3.a(hb.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eA();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, gv.a($$1x), this.c, $$0.y_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public czf d() {
         return this.b;
      }

      private void a(aki $$0, gv $$1, dey $$2, art $$3) {
         $$0.a($$1, $$2.a(czc.a, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(iw.E, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, aou.un, aov.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(cpk $$0, biw $$1) {
         if ($$1.ef() instanceof akj $$3) {
            bhe $$4 = $$1.ev() == null ? $$0.ag().a((cbl)$$3) : $$1.ev();
            ai.W.a($$3, $$1, $$4);
         }
      }
   }
}
