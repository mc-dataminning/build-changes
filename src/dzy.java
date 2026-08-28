import com.google.common.annotations.VisibleForTesting;

public class dzy extends dyo implements egs.b<dzy.a> {
   private final dzy.a a;

   public dzy(iw $$0, ebq $$1) {
      super(dyq.L, $$0, $$1);
      this.a = new dzy.a($$1, new egm($$0));
   }

   public static void a(dkj $$0, iw $$1, ebq $$2, dzy $$3) {
      $$3.a.d().a($$0, $$1, $$0.G_(), true);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dzy.a a() {
      return this.a;
   }

   public static class a implements egs {
      public static final int a = 8;
      final dur b;
      private final ebq c;
      private final egu d;

      public a(ebq $$0, egu $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dur.a();
      }

      @Override
      public egu a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public egs.a c() {
         return egs.a.b;
      }

      @Override
      public boolean a(asb $$0, jg<egq> $$1, egq.a $$2, fgc $$3) {
         if ($$1.a(egq.p) && $$2.a() instanceof byf $$4) {
            if (!$$4.eL()) {
               bvt $$5 = $$4.eI();
               int $$6 = $$4.a($$0, y.a($$5, bvt::d));
               if ($$4.eo() && $$6 > 0) {
                  this.b.a(iw.a((jq)$$3.a(jc.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eK();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, iw.a((jq)$$1x), this.c, $$0.G_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dur d() {
         return this.b;
      }

      private void a(asb $$0, iw $$1, ebq $$2, bai $$3) {
         $$0.a($$1, $$2.b(duo.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lz.K, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awy.wQ, awz.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dkj $$0, byf $$1) {
         if ($$1.er() instanceof asc $$3) {
            bvt $$4 = $$1.eI() == null ? $$0.al().a((csi)$$3) : $$1.eI();
            aq.Z.a($$3, $$1, $$4);
         }
      }
   }
}
