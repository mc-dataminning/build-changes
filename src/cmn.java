import javax.annotation.Nullable;

public class cmn extends cle {
   public cmn(buq<? extends cmn> $$0, dgg $$1) {
      super($$0, $$1);
      this.a(eto.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bT.a(3, new cdw<>(this, cni.class, true));
      super.B();
   }

   @Override
   protected avy u() {
      return avz.Dr;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.Dt;
   }

   @Override
   protected avy o_() {
      return avz.Ds;
   }

   @Override
   avy p() {
      return avz.Du;
   }

   @Override
   public axe<cwj> W() {
      return null;
   }

   @Override
   public boolean g(cwn $$0) {
      return !$$0.a(awx.bV) && super.g($$0);
   }

   @Override
   protected void a(arc $$0, bsz $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cli $$4 && $$4.gq()) {
         $$4.gr();
         this.a($$0, cwr.vl);
      }
   }

   @Override
   protected void a(azg $$0, bsg $$1) {
      this.a(bur.a, new cwn(cwr.pw));
   }

   @Override
   protected void a(dgx $$0, azg $$1, bsg $$2) {
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      bvy $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bwn.c).a(4.0);
      this.t();
      return $$4;
   }

   @Override
   public boolean c(arc $$0, buj $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bvf) {
            ((bvf)$$1).b(new bto(btq.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cpc a(cwn $$0, float $$1, @Nullable cwn $$2) {
      cpc $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean b(bto $$0) {
      return $$0.a(btq.t) ? false : super.b($$0);
   }
}
