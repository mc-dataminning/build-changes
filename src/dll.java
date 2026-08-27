import com.google.common.annotations.VisibleForTesting;

public class dll extends dkg implements drp.b<dll.a> {
   private final dll.a a;

   public dll(ib $$0, dmz $$1) {
      super(dki.K, $$0, $$1);
      this.a = new dll.a($$1, new drj($$0));
   }

   public static void a(cwz $$0, ib $$1, dmz $$2, dll $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dll.a b() {
      return this.a;
   }

   public static class a implements drp {
      public static final int a = 8;
      final dgu b;
      private final dmz c;
      private final drr d;

      public a(dmz $$0, drr $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dgu.a();
      }

      @Override
      public drr a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public drp.a c() {
         return drp.a.b;
      }

      @Override
      public boolean a(apf $$0, il<drn> $$1, drn.a $$2, epr $$3) {
         if ($$1.a(drn.p) && $$2.a() instanceof bpo $$4) {
            if (!$$4.eF()) {
               int $$5 = $$4.eg();
               if ($$4.ee() && $$5 > 0) {
                  this.b.a(ib.a($$3.a(ih.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eE();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, ib.a($$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dgu d() {
         return this.b;
      }

      private void a(apf $$0, ib $$1, dmz $$2, axd $$3) {
         $$0.a($$1, $$2.a(dgr.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(kc.H, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, aty.vw, atz.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(cwz $$0, bpo $$1) {
         if ($$1.ej() instanceof apg $$3) {
            bnv $$4 = $$1.ez() == null ? $$0.ah().a((cis)$$3) : $$1.ez();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}
