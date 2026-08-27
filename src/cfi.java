import javax.annotation.Nullable;

public class cfi extends cea {
   public cfi(bnw<? extends cfi> $$0, cvr $$1) {
      super($$0, $$1);
      this.a(ehh.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bP.a(3, new bwy<>(this, cga.class, true));
      super.B();
   }

   @Override
   protected atk y() {
      return atl.BG;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.BI;
   }

   @Override
   protected atk n_() {
      return atl.BH;
   }

   @Override
   atk w() {
      return atl.BJ;
   }

   @Override
   protected void a(bmp $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof ced $$4 && $$4.gh()) {
         $$4.gi();
         this.a((cvq)cpg.ui);
      }
   }

   @Override
   protected void a(awp $$0, blu $$1) {
      this.a(bnx.a, new cpd(cpg.oP));
   }

   @Override
   protected void b(awp $$0, blu $$1) {
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      bpa $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.f(bpp.c).a(4.0);
      this.A();
      return $$5;
   }

   @Override
   public boolean B(bnq $$0) {
      if (!super.B($$0)) {
         return false;
      } else {
         if ($$0 instanceof boi) {
            ((boi)$$0).b(new bnd(bnf.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected chr b(cpd $$0, float $$1) {
      chr $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bnd $$0) {
      return $$0.a(bnf.t) ? false : super.c($$0);
   }
}
