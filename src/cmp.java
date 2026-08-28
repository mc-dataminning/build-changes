import javax.annotation.Nullable;

public class cmp extends clg {
   public cmp(bus<? extends cmp> $$0, dgi $$1) {
      super($$0, $$1);
      this.a(etq.i, 8.0F);
   }

   @Override
   protected void E() {
      this.bT.a(3, new cdy<>(this, cnk.class, true));
      super.E();
   }

   @Override
   protected avz u() {
      return awa.Dr;
   }

   @Override
   protected avz e(btb $$0) {
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
   public axf<cwl> Z() {
      return null;
   }

   @Override
   public boolean g(cwp $$0) {
      return !$$0.a(awy.bV) && super.g($$0);
   }

   @Override
   protected void a(ard $$0, btb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof clk $$4 && $$4.gt()) {
         $$4.gu();
         this.a($$0, cwt.vl);
      }
   }

   @Override
   protected void a(azh $$0, bsi $$1) {
      this.a(but.a, new cwp(cwt.pw));
   }

   @Override
   protected void a(dgz $$0, azh $$1, bsi $$2) {
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      bwa $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bwp.c).a(4.0);
      this.t();
      return $$4;
   }

   @Override
   public boolean c(ard $$0, bul $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bvh) {
            ((bvh)$$1).b(new btq(bts.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cpe a(cwp $$0, float $$1, @Nullable cwp $$2) {
      cpe $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean b(btq $$0) {
      return $$0.a(bts.t) ? false : super.b($$0);
   }
}
