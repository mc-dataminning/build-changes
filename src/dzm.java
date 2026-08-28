import com.google.common.annotations.VisibleForTesting;

public class dzm extends dyc implements egg.b<dzm.a> {
   private final dzm.a a;

   public dzm(iv $$0, ebe $$1) {
      super(dye.L, $$0, $$1);
      this.a = new dzm.a($$1, new ega($$0));
   }

   public static void a(djx $$0, iv $$1, ebe $$2, dzm $$3) {
      $$3.a.d().a($$0, $$1, $$0.G_(), true);
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

   public dzm.a a() {
      return this.a;
   }

   public static class a implements egg {
      public static final int a = 8;
      final duf b;
      private final ebe c;
      private final egi d;

      public a(ebe $$0, egi $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = duf.a();
      }

      @Override
      public egi a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public egg.a c() {
         return egg.a.b;
      }

      @Override
      public boolean a(ars $$0, jf<ege> $$1, ege.a $$2, ffq $$3) {
         if ($$1.a(ege.p) && $$2.a() instanceof bxu $$4) {
            if (!$$4.eL()) {
               bvi $$5 = $$4.eI();
               int $$6 = $$4.a($$0, y.a($$5, bvi::d));
               if ($$4.eo() && $$6 > 0) {
                  this.b.a(iv.a((jp)$$3.a(jb.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eK();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, iv.a((jp)$$1x), this.c, $$0.G_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public duf d() {
         return this.b;
      }

      private void a(ars $$0, iv $$1, ebe $$2, azx $$3) {
         $$0.a($$1, $$2.b(duc.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(ly.K, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awp.wQ, awq.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(djx $$0, bxu $$1) {
         if ($$1.er() instanceof art $$3) {
            bvi $$4 = $$1.eI() == null ? $$0.al().a((crx)$$3) : $$1.eI();
            aq.Z.a($$3, $$1, $$4);
         }
      }
   }
}
