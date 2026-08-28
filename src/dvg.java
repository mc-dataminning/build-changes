import com.google.common.annotations.VisibleForTesting;

public class dvg extends dtx implements ebt.b<dvg.a> {
   private final dvg.a a;

   public dvg(ji $$0, dwv $$1) {
      super(dtz.L, $$0, $$1);
      this.a = new dvg.a($$1, new ebn($$0));
   }

   public static void a(dgg $$0, ji $$1, dwv $$2, dvg $$3) {
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

   public dvg.a b() {
      return this.a;
   }

   public static class a implements ebt {
      public static final int a = 8;
      final dqk b;
      private final dwv c;
      private final ebv d;

      public a(dwv $$0, ebv $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dqk.a();
      }

      @Override
      public ebv a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public ebt.a c() {
         return ebt.a.b;
      }

      @Override
      public boolean a(arc $$0, jr<ebr> $$1, ebr.a $$2, fay $$3) {
         if ($$1.a(ebr.p) && $$2.a() instanceof bvf $$4) {
            if (!$$4.eJ()) {
               bsz $$5 = $$4.eG();
               int $$6 = $$4.a($$0, x.a($$5, bsz::d));
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
      public dqk d() {
         return this.b;
      }

      private void a(arc $$0, ji $$1, dwv $$2, azg $$3) {
         $$0.a($$1, $$2.b(dqh.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lt.J, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, avz.wA, awa.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dgg $$0, bvf $$1) {
         if ($$1.eq() instanceof ard $$3) {
            bsz $$4 = $$1.eG() == null ? $$0.ak().a((cov)$$3) : $$1.eG();
            ap.Z.a($$3, $$1, $$4);
         }
      }
   }
}
