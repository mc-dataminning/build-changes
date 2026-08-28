import com.google.common.annotations.VisibleForTesting;

public class drm extends dqf implements dxy.b<drm.a> {
   private final drm.a a;

   public drm(jd $$0, dta $$1) {
      super(dqh.K, $$0, $$1);
      this.a = new drm.a($$1, new dxs($$0));
   }

   public static void a(dcu $$0, jd $$1, dta $$2, drm $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public drm.a b() {
      return this.a;
   }

   public static class a implements dxy {
      public static final int a = 8;
      final dms b;
      private final dta c;
      private final dya d;

      public a(dta $$0, dya $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dms.a();
      }

      @Override
      public dya a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dxy.a c() {
         return dxy.a.b;
      }

      @Override
      public boolean a(aqt $$0, jm<dxw> $$1, dxw.a $$2, eww $$3) {
         if ($$1.a(dxw.p) && $$2.a() instanceof btl $$4) {
            if (!$$4.eE()) {
               brj $$5 = $$4.ez();
               int $$6 = $$4.a($$0, x.a($$5, brj::d));
               if ($$4.ef() && $$6 > 0) {
                  this.b.a(jd.a((jw)$$3.a(ji.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eD();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, jd.a((jw)$$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dms d() {
         return this.b;
      }

      private void a(aqt $$0, jd $$1, dta $$2, ayv $$3) {
         $$0.a($$1, $$2.a(dmp.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lm.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, avo.wa, avp.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dcu $$0, btl $$1) {
         if ($$1.ej() instanceof aqu $$3) {
            brj $$4 = $$1.ez() == null ? $$0.aj().a((cmv)$$3) : $$1.ez();
            an.Z.a($$3, $$1, $$4);
         }
      }
   }
}
