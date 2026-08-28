import javax.annotation.Nullable;

public class cqb extends cos {
   public cqb(bxn<? extends cqb> $$0, dkj $$1) {
      super($$0, $$1);
      this.a(eyr.i, 8.0F);
   }

   @Override
   protected void C() {
      this.bG.a(3, new cgu<>(this, cqw.class, true));
      super.C();
   }

   @Override
   protected awx s() {
      return awy.DH;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.DJ;
   }

   @Override
   protected awx j_() {
      return awy.DI;
   }

   @Override
   awx p() {
      return awy.DK;
   }

   @Override
   public ayc<dag> X() {
      return null;
   }

   @Override
   public boolean g(dak $$0) {
      return !$$0.a(axv.bY) && super.g($$0);
   }

   @Override
   protected void a(asb $$0, bvt $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cow $$4 && $$4.gw()) {
         $$4.gx();
         this.a($$0, dao.vw);
      }
   }

   @Override
   protected void a(bai $$0, bva $$1) {
      this.a(bxo.a, new dak(dao.pF));
   }

   @Override
   protected void a(dla $$0, bai $$1, bva $$2) {
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      byx $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bzl.c).a(4.0);
      this.u();
      return $$4;
   }

   @Override
   public boolean c(asb $$0, bxe $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof byf) {
            ((byf)$$1).b(new bwi(bwk.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected csq a(dak $$0, float $$1, @Nullable dak $$2) {
      csq $$3 = super.a($$0, $$1, $$2);
      $$3.e(100.0F);
      return $$3;
   }

   @Override
   public boolean b(bwi $$0) {
      return $$0.a(bwk.t) ? false : super.b($$0);
   }
}
