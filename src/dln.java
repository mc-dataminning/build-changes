import com.google.common.annotations.VisibleForTesting;

public class dln extends dki implements drr.b<dln.a> {
   private final dln.a a;

   public dln(ib $$0, dnb $$1) {
      super(dkk.K, $$0, $$1);
      this.a = new dln.a($$1, new drl($$0));
   }

   public static void a(cxb $$0, ib $$1, dnb $$2, dln $$3) {
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

   public dln.a b() {
      return this.a;
   }

   public static class a implements drr {
      public static final int a = 8;
      final dgw b;
      private final dnb c;
      private final drt d;

      public a(dnb $$0, drt $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dgw.a();
      }

      @Override
      public drt a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public drr.a c() {
         return drr.a.b;
      }

      @Override
      public boolean a(apf $$0, il<drp> $$1, drp.a $$2, ept $$3) {
         if ($$1.a(drp.p) && $$2.a() instanceof bpp $$4) {
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
      public dgw d() {
         return this.b;
      }

      private void a(apf $$0, ib $$1, dnb $$2, axd $$3) {
         $$0.a($$1, $$2.a(dgt.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(kc.H, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, aty.vB, atz.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(cxb $$0, bpp $$1) {
         if ($$1.ej() instanceof apg $$3) {
            bnw $$4 = $$1.ez() == null ? $$0.ah().a((ciu)$$3) : $$1.ez();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}
