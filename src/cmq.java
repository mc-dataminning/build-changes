import javax.annotation.Nullable;

public class cmq extends clh {
   public cmq(but<? extends cmq> $$0, dgj $$1) {
      super($$0, $$1);
      this.a(etr.i, 8.0F);
   }

   @Override
   protected void E() {
      this.bT.a(3, new cdz<>(this, cnl.class, true));
      super.E();
   }

   @Override
   protected avz u() {
      return awa.Dr;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.Dt;
   }

   @Override
   protected avz o_() {
      return awa.Ds;
   }

   @Override
   avz p() {
      return awa.Du;
   }

   @Override
   public axf<cwm> Z() {
      return null;
   }

   @Override
   public boolean g(cwq $$0) {
      return !$$0.a(awy.bV) && super.g($$0);
   }

   @Override
   protected void a(ard $$0, btc $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cll $$4 && $$4.gt()) {
         $$4.gu();
         this.a($$0, cwu.vl);
      }
   }

   @Override
   protected void a(azh $$0, bsj $$1) {
      this.a(buu.a, new cwq(cwu.pw));
   }

   @Override
   protected void a(dha $$0, azh $$1, bsj $$2) {
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      bwb $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bwq.c).a(4.0);
      this.t();
      return $$4;
   }

   @Override
   public boolean c(ard $$0, bum $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bvi) {
            ((bvi)$$1).b(new btr(btt.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cpf a(cwq $$0, float $$1, @Nullable cwq $$2) {
      cpf $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean b(btr $$0) {
      return $$0.a(btt.t) ? false : super.b($$0);
   }
}
