import javax.annotation.Nullable;

public class cgr extends cfi {
   public cgr(bpd<? extends cgr> $$0, cxb $$1) {
      super($$0, $$1);
      this.a(ejg.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bS.a(3, new byf<>(this, chj.class, true));
      super.z();
   }

   @Override
   protected atx v() {
      return aty.Cc;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.Ce;
   }

   @Override
   protected atx n_() {
      return aty.Cd;
   }

   @Override
   atx s() {
      return aty.Cf;
   }

   @Override
   protected void a(bnw $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cfm $$4 && $$4.go()) {
         $$4.gp();
         this.a((cxa)cqp.uk);
      }
   }

   @Override
   protected void a(axd $$0, bnb $$1) {
      this.a(bpe.a, new cqm(cqp.oP));
   }

   @Override
   protected void b(axd $$0, bnb $$1) {
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      bqh $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(bqw.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean C(box $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bpp) {
            ((bpp)$$0).b(new bok(bom.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cja b(cqm $$0, float $$1) {
      cja $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bok $$0) {
      return $$0.a(bom.t) ? false : super.c($$0);
   }
}
