import com.google.common.annotations.VisibleForTesting;

public class dfw extends der implements dli.b<dfw.a> {
   private final dfw.a a;

   public dfw(ht $$0, dgw $$1) {
      super(det.K, $$0, $$1);
      this.a = new dfw.a($$1, new dlc($$0));
   }

   public static void a(crs $$0, ht $$1, dgw $$2, dfw $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   public void a(rz $$0) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(rz $$0) {
      this.a.b.b($$0);
      super.b($$0);
   }

   public dfw.a c() {
      return this.a;
   }

   public static class a implements dli {
      public static final int a = 8;
      final dbn b;
      private final dgw c;
      private final dlk d;

      public a(dgw $$0, dlk $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dbn.a();
      }

      @Override
      public dlk a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dli.a c() {
         return dli.a.b;
      }

      @Override
      public boolean a(ama $$0, dlg $$1, dlg.a $$2, eji $$3) {
         if ($$1 == dlg.p && $$2.a() instanceof bky $$4) {
            if (!$$4.eC()) {
               int $$5 = $$4.ed();
               if ($$4.eb() && $$5 > 0) {
                  this.b.a(ht.a($$3.a(hx.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eB();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, ht.a($$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dbn d() {
         return this.b;
      }

      private void a(ama $$0, ht $$1, dgw $$2, ato $$3) {
         $$0.a($$1, $$2.a(dbk.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(js.E, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, aqn.ur, aqo.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(crs $$0, bky $$1) {
         if ($$1.eg() instanceof amb $$3) {
            bjg $$4 = $$1.ew() == null ? $$0.ag().a((cdm)$$3) : $$1.ew();
            al.W.a($$3, $$1, $$4);
         }
      }
   }
}
