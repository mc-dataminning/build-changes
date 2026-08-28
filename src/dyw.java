import com.google.common.annotations.VisibleForTesting;

public class dyw extends dxm implements efq.b<dyw.a> {
   private final dyw.a a;

   public dyw(iv $$0, eao $$1) {
      super(dxo.L, $$0, $$1);
      this.a = new dyw.a($$1, new efk($$0));
   }

   public static void a(djh $$0, iv $$1, eao $$2, dyw $$3) {
      $$3.a.d().a($$0, $$1, $$0.C_(), true);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dyw.a a() {
      return this.a;
   }

   public static class a implements efq {
      public static final int a = 8;
      final dtp b;
      private final eao c;
      private final efs d;

      public a(eao $$0, efs $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dtp.a();
      }

      @Override
      public efs a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public efq.a c() {
         return efq.a.b;
      }

      @Override
      public boolean a(arq $$0, jf<efo> $$1, efo.a $$2, fex $$3) {
         if ($$1.a(efo.p) && $$2.a() instanceof bxj $$4) {
            if (!$$4.eK()) {
               bux $$5 = $$4.eH();
               int $$6 = $$4.a($$0, y.a($$5, bux::d));
               if ($$4.en() && $$6 > 0) {
                  this.b.a(iv.a((jp)$$3.a(jb.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eJ();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, iv.a((jp)$$1x), this.c, $$0.C_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dtp d() {
         return this.b;
      }

      private void a(arq $$0, iv $$1, eao $$2, azv $$3) {
         $$0.a($$1, $$2.b(dtm.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(ly.K, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awn.wQ, awo.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(djh $$0, bxj $$1) {
         if ($$1.eq() instanceof arr $$3) {
            bux $$4 = $$1.eH() == null ? $$0.al().a((crj)$$3) : $$1.eH();
            aq.Z.a($$3, $$1, $$4);
         }
      }
   }
}
