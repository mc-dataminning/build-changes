import javax.annotation.Nullable;

public class cmo extends clf {
   public cmo(bur<? extends cmo> $$0, dgi $$1) {
      super($$0, $$1);
      this.a(etq.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bT.a(3, new cdx<>(this, cnk.class, true));
      super.B();
   }

   @Override
   protected avz u() {
      return awa.Ds;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.Du;
   }

   @Override
   protected avz o_() {
      return awa.Dt;
   }

   @Override
   avz p() {
      return awa.Dv;
   }

   @Override
   protected void a(arc $$0, bta $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof clj $$4 && $$4.gq()) {
         $$4.gr();
         this.a($$0, cwt.vl);
      }
   }

   @Override
   protected void a(azh $$0, bsh $$1) {
      this.a(bus.a, new cwp(cwt.pw));
   }

   @Override
   protected void a(dgz $$0, azh $$1, bsh $$2) {
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      bvz $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bwo.c).a(4.0);
      this.t();
      return $$4;
   }

   @Override
   public boolean c(arc $$0, buk $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bvg) {
            ((bvg)$$1).b(new btp(btr.t, 200), this);
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
   public boolean b(btp $$0) {
      return $$0.a(btr.t) ? false : super.b($$0);
   }
}
