public class cfd extends cfz {
   public cfd(bol<? extends cfd> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public static boolean a(bol<cfd> $$0, cwt $$1, bpb $$2, ib $$3, awt $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bpb.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean af_() {
      return false;
   }

   @Override
   protected ato y() {
      return atp.mB;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.mE;
   }

   @Override
   protected ato n_() {
      return atp.mD;
   }

   @Override
   protected ato gl() {
      return atp.mF;
   }

   @Override
   public boolean B(bof $$0) {
      boolean $$1 = super.B($$0);
      if ($$1 && this.eR().b() && $$0 instanceof box) {
         float $$2 = this.dJ().d_(this.dj()).b();
         ((box)$$0).b(new bns(bnu.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gn() {
      return true;
   }

   @Override
   protected void ae_() {
      this.b(bol.bs);
      if (!this.aU()) {
         this.dJ().a(null, 1041, this.dj(), 0);
      }
   }

   @Override
   protected cpq gm() {
      return cpq.h;
   }
}
