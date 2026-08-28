import javax.annotation.Nullable;

public class ckp extends cjg {
   public ckp(bsv<? extends ckp> $$0, dbt $$1) {
      super($$0, $$1);
      this.a(eoh.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bT.a(3, new ccb<>(this, clh.class, true));
      super.z();
   }

   @Override
   protected avv v() {
      return avw.Cz;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.CB;
   }

   @Override
   protected avv o_() {
      return avw.CA;
   }

   @Override
   avv u() {
      return avw.CC;
   }

   @Override
   protected void a(bri $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cjk $$4 && $$4.gr()) {
         $$4.gs();
         this.a((dbs)cun.um);
      }
   }

   @Override
   protected void a(azc $$0, bqn $$1) {
      this.a(bsw.a, new cuk(cun.oQ));
   }

   @Override
   protected void b(azc $$0, bqn $$1) {
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      bud $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(bus.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean C(bsp $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof btk) {
            ((btk)$$0).b(new brx(brz.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cmy b(cuk $$0, float $$1) {
      cmy $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(brx $$0) {
      return $$0.a(brz.t) ? false : super.c($$0);
   }
}
