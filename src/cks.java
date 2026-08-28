import javax.annotation.Nullable;

public class cks extends cjj {
   public cks(bsy<? extends cks> $$0, dbw $$1) {
      super($$0, $$1);
      this.a(eok.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bT.a(3, new cce<>(this, clk.class, true));
      super.z();
   }

   @Override
   protected avy v() {
      return avz.Cz;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.CB;
   }

   @Override
   protected avy o_() {
      return avz.CA;
   }

   @Override
   avy u() {
      return avz.CC;
   }

   @Override
   protected void a(brl $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cjn $$4 && $$4.gr()) {
         $$4.gs();
         this.a((dbv)cuq.um);
      }
   }

   @Override
   protected void a(azf $$0, bqq $$1) {
      this.a(bsz.a, new cun(cuq.oQ));
   }

   @Override
   protected void b(azf $$0, bqq $$1) {
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      bug $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(buv.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean C(bss $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof btn) {
            ((btn)$$0).b(new bsa(bsc.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cnb b(cun $$0, float $$1) {
      cnb $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bsa $$0) {
      return $$0.a(bsc.t) ? false : super.c($$0);
   }
}
