import javax.annotation.Nullable;

public class chx extends cgo {
   public chx(bqg<? extends chx> $$0, czg $$1) {
      super($$0, $$1);
      this.a(els.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bS.a(3, new bzj<>(this, cip.class, true));
      super.z();
   }

   @Override
   protected aun v() {
      return auo.Cg;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.Ci;
   }

   @Override
   protected aun o_() {
      return auo.Ch;
   }

   @Override
   aun u() {
      return auo.Cj;
   }

   @Override
   protected void a(boy $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cgs $$4 && $$4.go()) {
         $$4.gp();
         this.a((czf)crv.uk);
      }
   }

   @Override
   protected void a(axt $$0, bod $$1) {
      this.a(bqh.a, new crs(crv.oP));
   }

   @Override
   protected void b(axt $$0, bod $$1) {
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      brl $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(bsa.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean C(bqa $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bqt) {
            ((bqt)$$0).b(new bpm(bpo.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected ckg b(crs $$0, float $$1) {
      ckg $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bpm $$0) {
      return $$0.a(bpo.t) ? false : super.c($$0);
   }
}
