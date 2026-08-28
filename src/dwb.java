import com.google.common.annotations.VisibleForTesting;

public class dwb extends dus implements ecr.b<dwb.a> {
   private final dwb.a a;

   public dwb(ji $$0, dxq $$1) {
      super(duu.L, $$0, $$1);
      this.a = new dwb.a($$1, new ecl($$0));
   }

   public static void a(dgz $$0, ji $$1, dxq $$2, dwb $$3) {
      $$3.a.d().a($$0, $$1, $$0.C_(), true);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dwb.a b() {
      return this.a;
   }

   public static class a implements ecr {
      public static final int a = 8;
      final dre b;
      private final dxq c;
      private final ect d;

      public a(dxq $$0, ect $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dre.a();
      }

      @Override
      public ect a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public ecr.a c() {
         return ecr.a.b;
      }

      @Override
      public boolean a(ard $$0, jr<ecp> $$1, ecp.a $$2, fbx $$3) {
         if ($$1.a(ecp.p) && $$2.a() instanceof bvy $$4) {
            if (!$$4.eJ()) {
               btp $$5 = $$4.eG();
               int $$6 = $$4.a($$0, x.a($$5, btp::d));
               if ($$4.em() && $$6 > 0) {
                  this.b.a(ji.a((kb)$$3.a(jn.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eI();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, ji.a((kb)$$1x), this.c, $$0.C_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dre d() {
         return this.b;
      }

      private void a(ard $$0, ji $$1, dxq $$2, azh $$3) {
         $$0.a($$1, $$2.b(drb.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lt.K, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awa.wK, awb.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dgz $$0, bvy $$1) {
         if ($$1.ep() instanceof are $$3) {
            btp $$4 = $$1.eG() == null ? $$0.al().a((cpr)$$3) : $$1.eG();
            ap.Z.a($$3, $$1, $$4);
         }
      }
   }
}
