import com.google.common.annotations.VisibleForTesting;

public class dwf extends duw implements ecs.b<dwf.a> {
   private final dwf.a a;

   public dwf(jh $$0, dxu $$1) {
      super(duy.L, $$0, $$1);
      this.a = new dwf.a($$1, new ecm($$0));
   }

   public static void a(dhh $$0, jh $$1, dxu $$2, dwf $$3) {
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

   public dwf.a b() {
      return this.a;
   }

   public static class a implements ecs {
      public static final int a = 8;
      final drj b;
      private final dxu c;
      private final ecu d;

      public a(dxu $$0, ecu $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = drj.a();
      }

      @Override
      public ecu a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public ecs.a c() {
         return ecs.a.b;
      }

      @Override
      public boolean a(ash $$0, jq<ecq> $$1, ecq.a $$2, fbx $$3) {
         if ($$1.a(ecq.p) && $$2.a() instanceof bwf $$4) {
            if (!$$4.eJ()) {
               btz $$5 = $$4.eG();
               int $$6 = $$4.a($$0, x.a($$5, btz::d));
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
      public drj d() {
         return this.b;
      }

      private void a(ash $$0, jh $$1, dxu $$2, bam $$3) {
         $$0.a($$1, $$2.b(drg.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(ls.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, axf.wu, axg.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dhh $$0, bwf $$1) {
         if ($$1.eq() instanceof asi $$3) {
            btz $$4 = $$1.eG() == null ? $$0.aj().a((cpw)$$3) : $$1.eG();
            ao.Z.a($$3, $$1, $$4);
         }
      }
   }
}
