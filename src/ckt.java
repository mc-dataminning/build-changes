import javax.annotation.Nullable;

public class ckt extends cjk {
   public ckt(bsz<? extends ckt> $$0, dbx $$1) {
      super($$0, $$1);
      this.a(eol.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bT.a(3, new ccf<>(this, cll.class, true));
      super.z();
   }

   @Override
   protected avy v() {
      return avz.Cz;
   }

   @Override
   protected avy d(brm $$0) {
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
   protected void a(brm $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cjo $$4 && $$4.gr()) {
         $$4.gs();
         this.a((dbw)cur.um);
      }
   }

   @Override
   protected void a(azg $$0, bqr $$1) {
      this.a(bta.a, new cuo(cur.oQ));
   }

   @Override
   protected void b(azg $$0, bqr $$1) {
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      buh $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(buw.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean C(bst $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bto) {
            ((bto)$$0).b(new bsb(bsd.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cnc b(cuo $$0, float $$1) {
      cnc $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bsb $$0) {
      return $$0.a(bsd.t) ? false : super.c($$0);
   }
}
