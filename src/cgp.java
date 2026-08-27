import javax.annotation.Nullable;

public class cgp extends cfh {
   public cgp(bpc<? extends cgp> $$0, cwz $$1) {
      super($$0, $$1);
      this.a(eiy.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bS.a(3, new bye<>(this, chh.class, true));
      super.z();
   }

   @Override
   protected atx v() {
      return aty.BX;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.BZ;
   }

   @Override
   protected atx n_() {
      return aty.BY;
   }

   @Override
   atx s() {
      return aty.Ca;
   }

   @Override
   protected void a(bnv $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cfk $$4 && $$4.go()) {
         $$4.gp();
         this.a((cwy)cqn.uj);
      }
   }

   @Override
   protected void a(axd $$0, bna $$1) {
      this.a(bpd.a, new cqk(cqn.oP));
   }

   @Override
   protected void b(axd $$0, bna $$1) {
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      bqg $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(bqv.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean C(bow $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bpo) {
            ((bpo)$$0).b(new boj(bol.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected ciy b(cqk $$0, float $$1) {
      ciy $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(boj $$0) {
      return $$0.a(bol.t) ? false : super.c($$0);
   }
}
