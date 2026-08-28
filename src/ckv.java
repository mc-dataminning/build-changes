import javax.annotation.Nullable;

public class ckv extends cjm {
   public ckv(btb<? extends ckv> $$0, dbz $$1) {
      super($$0, $$1);
      this.a(eon.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bT.a(3, new cch<>(this, cln.class, true));
      super.z();
   }

   @Override
   protected avz v() {
      return awa.Cz;
   }

   @Override
   protected avz d(bro $$0) {
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
   protected void a(bro $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cjq $$4 && $$4.gr()) {
         $$4.gs();
         this.a((dby)cut.um);
      }
   }

   @Override
   protected void a(azh $$0, bqt $$1) {
      this.a(btc.a, new cuq(cut.oQ));
   }

   @Override
   protected void b(azh $$0, bqt $$1) {
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      buj $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(buy.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean C(bsv $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof btq) {
            ((btq)$$0).b(new bsd(bsf.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cne b(cuq $$0, float $$1) {
      cne $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bsd $$0) {
      return $$0.a(bsf.t) ? false : super.c($$0);
   }
}
