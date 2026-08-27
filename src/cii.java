import javax.annotation.Nullable;

public class cii extends cgz {
   public cii(bqr<? extends cii> $$0, czu $$1) {
      super($$0, $$1);
      this.a(emi.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bT.a(3, new bzu<>(this, cja.class, true));
      super.z();
   }

   @Override
   protected auy v() {
      return auz.Cn;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.Cp;
   }

   @Override
   protected auy o_() {
      return auz.Co;
   }

   @Override
   auy u() {
      return auz.Cq;
   }

   @Override
   protected void a(bpj $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof chd $$4 && $$4.gq()) {
         $$4.gr();
         this.a((czt)csg.um);
      }
   }

   @Override
   protected void a(ayd $$0, boo $$1) {
      this.a(bqs.a, new csd(csg.oQ));
   }

   @Override
   protected void b(ayd $$0, boo $$1) {
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      brw $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(bsl.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean C(bql $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bre) {
            ((bre)$$0).b(new bpx(bpz.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected ckr b(csd $$0, float $$1) {
      ckr $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bpx $$0) {
      return $$0.a(bpz.t) ? false : super.c($$0);
   }
}
