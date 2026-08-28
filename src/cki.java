import javax.annotation.Nullable;

public class cki extends ciz {
   public cki(bsn<? extends cki> $$0, dcg $$1) {
      super($$0, $$1);
      this.a(epa.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bV.a(3, new cbt<>(this, cla.class, true));
      super.z();
   }

   @Override
   protected avg v() {
      return avh.CC;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.CE;
   }

   @Override
   protected avg n_() {
      return avh.CD;
   }

   @Override
   avg t() {
      return avh.CF;
   }

   @Override
   protected void a(aqm $$0, bra $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cjd $$4 && $$4.go()) {
         $$4.gp();
         this.a((dcf)cug.um);
      }
   }

   @Override
   protected void a(ayo $$0, bqf $$1) {
      this.a(bso.a, new cud(cug.oR));
   }

   @Override
   protected void a(dcv $$0, ayo $$1, bqf $$2) {
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      btv $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(buk.c).a(4.0);
      this.x();
      return $$4;
   }

   @Override
   public boolean D(bsh $$0) {
      if (!super.D($$0)) {
         return false;
      } else {
         if ($$0 instanceof btc) {
            ((btc)$$0).b(new brp(brr.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cmr a(cud $$0, float $$1, @Nullable cud $$2) {
      cmr $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean c(brp $$0) {
      return $$0.a(brr.t) ? false : super.c($$0);
   }
}
