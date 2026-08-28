import com.google.common.annotations.VisibleForTesting;

public class dwg extends dux implements ect.b<dwg.a> {
   private final dwg.a a;

   public dwg(jh $$0, dxv $$1) {
      super(duz.L, $$0, $$1);
      this.a = new dwg.a($$1, new ecn($$0));
   }

   public static void a(dhi $$0, jh $$1, dxv $$2, dwg $$3) {
      $$3.a.d().a($$0, $$1, $$0.H_(), true);
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dwg.a b() {
      return this.a;
   }

   public static class a implements ect {
      public static final int a = 8;
      final drk b;
      private final dxv c;
      private final ecv d;

      public a(dxv $$0, ecv $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = drk.a();
      }

      @Override
      public ecv a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public ect.a c() {
         return ect.a.b;
      }

      @Override
      public boolean a(ash $$0, jq<ecr> $$1, ecr.a $$2, fby $$3) {
         if ($$1.a(ecr.p) && $$2.a() instanceof bwg $$4) {
            if (!$$4.eJ()) {
               bua $$5 = $$4.eG();
               int $$6 = $$4.a($$0, x.a($$5, bua::d));
               if ($$4.en() && $$6 > 0) {
                  this.b.a(jh.a((ka)$$3.a(jm.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eI();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, jh.a((ka)$$1x), this.c, $$0.H_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public drk d() {
         return this.b;
      }

      private void a(ash $$0, jh $$1, dxv $$2, bam $$3) {
         $$0.a($$1, $$2.b(drh.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(ls.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, axf.wu, axg.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dhi $$0, bwg $$1) {
         if ($$1.eq() instanceof asi $$3) {
            bua $$4 = $$1.eG() == null ? $$0.aj().a((cpx)$$3) : $$1.eG();
            ao.Z.a($$3, $$1, $$4);
         }
      }
   }
}
