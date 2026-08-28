import com.google.common.annotations.VisibleForTesting;

public class dvj extends dua implements ebw.b<dvj.a> {
   private final dvj.a a;

   public dvj(ji $$0, dwy $$1) {
      super(duc.L, $$0, $$1);
      this.a = new dvj.a($$1, new ebq($$0));
   }

   public static void a(dgj $$0, ji $$1, dwy $$2, dvj $$3) {
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

   public dvj.a b() {
      return this.a;
   }

   public static class a implements ebw {
      public static final int a = 8;
      final dqn b;
      private final dwy c;
      private final eby d;

      public a(dwy $$0, eby $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dqn.a();
      }

      @Override
      public eby a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public ebw.a c() {
         return ebw.a.b;
      }

      @Override
      public boolean a(ard $$0, jr<ebu> $$1, ebu.a $$2, fbb $$3) {
         if ($$1.a(ebu.p) && $$2.a() instanceof bvi $$4) {
            if (!$$4.eI()) {
               btc $$5 = $$4.eF();
               int $$6 = $$4.a($$0, x.a($$5, btc::d));
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
      public dqn d() {
         return this.b;
      }

      private void a(ard $$0, ji $$1, dwy $$2, azh $$3) {
         $$0.a($$1, $$2.b(dqk.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lt.J, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awa.wA, awb.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dgj $$0, bvi $$1) {
         if ($$1.ep() instanceof are $$3) {
            btc $$4 = $$1.eF() == null ? $$0.ak().a((coy)$$3) : $$1.eF();
            ap.Z.a($$3, $$1, $$4);
         }
      }
   }
}
