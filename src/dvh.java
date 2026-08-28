import com.google.common.annotations.VisibleForTesting;

public class dvh extends dty implements ebu.b<dvh.a> {
   private final dvh.a a;

   public dvh(ji $$0, dww $$1) {
      super(dua.L, $$0, $$1);
      this.a = new dvh.a($$1, new ebo($$0));
   }

   public static void a(dgh $$0, ji $$1, dww $$2, dvh $$3) {
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

   public dvh.a b() {
      return this.a;
   }

   public static class a implements ebu {
      public static final int a = 8;
      final dql b;
      private final dww c;
      private final ebw d;

      public a(dww $$0, ebw $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dql.a();
      }

      @Override
      public ebw a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public ebu.a c() {
         return ebu.a.b;
      }

      @Override
      public boolean a(ard $$0, jr<ebs> $$1, ebs.a $$2, faz $$3) {
         if ($$1.a(ebs.p) && $$2.a() instanceof bvg $$4) {
            if (!$$4.eI()) {
               bta $$5 = $$4.eF();
               int $$6 = $$4.a($$0, x.a($$5, bta::d));
               if ($$4.em() && $$6 > 0) {
                  this.b.a(ji.a((kb)$$3.a(jn.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eH();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, ji.a((kb)$$1x), this.c, $$0.H_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dql d() {
         return this.b;
      }

      private void a(ard $$0, ji $$1, dww $$2, azh $$3) {
         $$0.a($$1, $$2.b(dqi.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lt.J, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awa.wA, awb.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dgh $$0, bvg $$1) {
         if ($$1.ep() instanceof are $$3) {
            bta $$4 = $$1.eF() == null ? $$0.ak().a((cow)$$3) : $$1.eF();
            ap.Z.a($$3, $$1, $$4);
         }
      }
   }
}
