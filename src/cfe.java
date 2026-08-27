import javax.annotation.Nullable;

public class cfe extends cdw {
   public cfe(bnu<? extends cfe> $$0, cvn $$1) {
      super($$0, $$1);
      this.a(eha.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bP.a(3, new bwu<>(this, cfw.class, true));
      super.B();
   }

   @Override
   protected atj y() {
      return atk.BF;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.BH;
   }

   @Override
   protected atj n_() {
      return atk.BG;
   }

   @Override
   atj w() {
      return atk.BI;
   }

   @Override
   protected void a(bmn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cdz $$4 && $$4.gh()) {
         $$4.gi();
         this.a((cvm)cpc.ui);
      }
   }

   @Override
   protected void a(awo $$0, bls $$1) {
      this.a(bnv.a, new coz(cpc.oP));
   }

   @Override
   protected void b(awo $$0, bls $$1) {
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      boy $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.f(bpl.c).a(4.0);
      this.A();
      return $$5;
   }

   @Override
   public boolean B(bno $$0) {
      if (!super.B($$0)) {
         return false;
      } else {
         if ($$0 instanceof bog) {
            ((bog)$$0).b(new bnb(bnd.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected chn b(coz $$0, float $$1) {
      chn $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bnb $$0) {
      return $$0.a(bnd.t) ? false : super.c($$0);
   }
}
