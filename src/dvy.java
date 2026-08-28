import com.google.common.annotations.VisibleForTesting;

public class dvy extends dup implements ecl.b<dvy.a> {
   private final dvy.a a;

   public dvy(jh $$0, dxn $$1) {
      super(dur.L, $$0, $$1);
      this.a = new dvy.a($$1, new ecf($$0));
   }

   public static void a(dha $$0, jh $$1, dxn $$2, dvy $$3) {
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

   public dvy.a b() {
      return this.a;
   }

   public static class a implements ecl {
      public static final int a = 8;
      final drc b;
      private final dxn c;
      private final ecn d;

      public a(dxn $$0, ecn $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = drc.a();
      }

      @Override
      public ecn a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public ecl.a c() {
         return ecl.a.b;
      }

      @Override
      public boolean a(ash $$0, jq<ecj> $$1, ecj.a $$2, fbs $$3) {
         if ($$1.a(ecj.p) && $$2.a() instanceof bwb $$4) {
            if (!$$4.eI()) {
               btv $$5 = $$4.eF();
               int $$6 = $$4.a($$0, x.a($$5, btv::d));
               if ($$4.em() && $$6 > 0) {
                  this.b.a(jh.a((ka)$$3.a(jm.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eH();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, jh.a((ka)$$1x), this.c, $$0.H_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public drc d() {
         return this.b;
      }

      private void a(ash $$0, jh $$1, dxn $$2, bam $$3) {
         $$0.a($$1, $$2.b(dqz.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(ls.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, axf.wt, axg.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dha $$0, bwb $$1) {
         if ($$1.ep() instanceof asi $$3) {
            btv $$4 = $$1.eF() == null ? $$0.aj().a((cps)$$3) : $$1.eF();
            ao.Z.a($$3, $$1, $$4);
         }
      }
   }
}
