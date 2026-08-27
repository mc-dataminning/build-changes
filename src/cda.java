import javax.annotation.Nullable;

public class cda extends cbs {
   public cda(blt<? extends cda> $$0, cti $$1) {
      super($$0, $$1);
      this.a(eev.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bP.a(3, new buu<>(this, cdq.class, true));
      super.B();
   }

   @Override
   protected arl y() {
      return arm.Bq;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.Bs;
   }

   @Override
   protected arl n_() {
      return arm.Br;
   }

   @Override
   arl w() {
      return arm.Bt;
   }

   @Override
   protected void a(bkn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cbv $$4 && $$4.gf()) {
         $$4.gg();
         this.a((cth)cmu.uf);
      }
   }

   @Override
   protected void a(aup $$0, bjt $$1) {
      this.a(blu.a, new cmr(cmu.oN));
   }

   @Override
   protected void b(aup $$0, bjt $$1) {
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      bmy $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(bnl.c).a(4.0);
      this.A();
      return $$5;
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return 2.1F;
   }

   @Override
   protected float l(blp $$0) {
      return -0.875F;
   }

   @Override
   public boolean C(blp $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bmf) {
            ((bmf)$$0).b(new blc(ble.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cfh b(cmr $$0, float $$1) {
      cfh $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(blc $$0) {
      return $$0.c() == ble.t ? false : super.c($$0);
   }
}
