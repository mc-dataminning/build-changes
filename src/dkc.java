import com.google.common.annotations.VisibleForTesting;

public class dkc extends dix implements dpy.b<dkc.a> {
   private final dkc.a a;

   public dkc(hz $$0, dlj $$1) {
      super(diz.K, $$0, $$1);
      this.a = new dkc.a($$1, new dps($$0));
   }

   public static void a(cvr $$0, hz $$1, dlj $$2, dkc $$3) {
      $$3.a.d().a($$0, $$1, $$0.F_(), true);
   }

   @Override
   public void a(sw $$0) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(sw $$0) {
      this.a.b.b($$0);
      super.b($$0);
   }

   public dkc.a c() {
      return this.a;
   }

   public static class a implements dpy {
      public static final int a = 8;
      final dfm b;
      private final dlj c;
      private final dqa d;

      public a(dlj $$0, dqa $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dfm.a();
      }

      @Override
      public dqa a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dpy.a c() {
         return dpy.a.b;
      }

      @Override
      public boolean a(aow $$0, ij<dpw> $$1, dpw.a $$2, enz $$3) {
         if ($$1.a(dpw.p) && $$2.a() instanceof boi $$4) {
            if (!$$4.eE()) {
               int $$5 = $$4.ef();
               if ($$4.ed() && $$5 > 0) {
                  this.b.a(hz.a($$3.a(ie.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eD();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, hz.a($$1x), this.c, $$0.F_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dfm d() {
         return this.b;
      }

      private void a(aow $$0, hz $$1, dlj $$2, awp $$3) {
         $$0.a($$1, $$2.a(dfj.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(jz.G, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, atl.vt, atm.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(cvr $$0, boi $$1) {
         if ($$1.ei() instanceof aox $$3) {
            bmp $$4 = $$1.ey() == null ? $$0.ah().a((chl)$$3) : $$1.ey();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}
