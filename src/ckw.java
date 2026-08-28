import javax.annotation.Nullable;

public class ckw extends cjn {
   public ckw(btc<? extends ckw> $$0, dca $$1) {
      super($$0, $$1);
      this.a(eoo.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bT.a(3, new cci<>(this, clo.class, true));
      super.z();
   }

   @Override
   protected avz v() {
      return awa.Cz;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.CB;
   }

   @Override
   protected avz o_() {
      return awa.CA;
   }

   @Override
   avz u() {
      return awa.CC;
   }

   @Override
   protected void a(brp $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cjr $$4 && $$4.gr()) {
         $$4.gs();
         this.a((dbz)cuu.um);
      }
   }

   @Override
   protected void a(azh $$0, bqu $$1) {
      this.a(btd.a, new cur(cuu.oQ));
   }

   @Override
   protected void b(azh $$0, bqu $$1) {
   }

   @Nullable
   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      buk $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(buz.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean C(bsw $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof btr) {
            ((btr)$$0).b(new bse(bsg.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cnf b(cur $$0, float $$1) {
      cnf $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bse $$0) {
      return $$0.a(bsg.t) ? false : super.c($$0);
   }
}
