import com.google.common.annotations.VisibleForTesting;

public class dvi extends dtz implements ebv.b<dvi.a> {
   private final dvi.a a;

   public dvi(ji $$0, dwx $$1) {
      super(dub.L, $$0, $$1);
      this.a = new dvi.a($$1, new ebp($$0));
   }

   public static void a(dgi $$0, ji $$1, dwx $$2, dvi $$3) {
      $$3.a.d().a($$0, $$1, $$0.H_(), true);
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

   public dvi.a b() {
      return this.a;
   }

   public static class a implements ebv {
      public static final int a = 8;
      final dqm b;
      private final dwx c;
      private final ebx d;

      public a(dwx $$0, ebx $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dqm.a();
      }

      @Override
      public ebx a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public ebv.a c() {
         return ebv.a.b;
      }

      @Override
      public boolean a(arc $$0, jr<ebt> $$1, ebt.a $$2, fba $$3) {
         if ($$1.a(ebt.p) && $$2.a() instanceof bvg $$4) {
            if (!$$4.eJ()) {
               bta $$5 = $$4.eG();
               int $$6 = $$4.a($$0, x.a($$5, bta::d));
               if ($$4.en() && $$6 > 0) {
                  this.b.a(ji.a((kb)$$3.a(jn.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eI();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, ji.a((kb)$$1x), this.c, $$0.H_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dqm d() {
         return this.b;
      }

      private void a(arc $$0, ji $$1, dwx $$2, azh $$3) {
         $$0.a($$1, $$2.b(dqj.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lt.J, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awa.wA, awb.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dgi $$0, bvg $$1) {
         if ($$1.eq() instanceof ard $$3) {
            bta $$4 = $$1.eG() == null ? $$0.ak().a((cox)$$3) : $$1.eG();
            ap.Z.a($$3, $$1, $$4);
         }
      }
   }
}
