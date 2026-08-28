import javax.annotation.Nullable;

public class cmo extends clf {
   public cmo(bur<? extends cmo> $$0, dgh $$1) {
      super($$0, $$1);
      this.a(etp.i, 8.0F);
   }

   @Override
   protected void E() {
      this.bT.a(3, new cdx<>(this, cnj.class, true));
      super.E();
   }

   @Override
   protected avz u() {
      return awa.Dr;
   }

   @Override
   protected avz e(bta $$0) {
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
   public axf<cwk> Z() {
      return null;
   }

   @Override
   public boolean g(cwo $$0) {
      return !$$0.a(awy.bV) && super.g($$0);
   }

   @Override
   protected void a(ard $$0, bta $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof clj $$4 && $$4.gt()) {
         $$4.gu();
         this.a($$0, cws.vl);
      }
   }

   @Override
   protected void a(azh $$0, bsh $$1) {
      this.a(bus.a, new cwo(cws.pw));
   }

   @Override
   protected void a(dgy $$0, azh $$1, bsh $$2) {
   }

   @Nullable
   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      bvz $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bwo.c).a(4.0);
      this.t();
      return $$4;
   }

   @Override
   public boolean c(ard $$0, buk $$1) {
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
   protected cpd a(cwo $$0, float $$1, @Nullable cwo $$2) {
      cpd $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean b(btp $$0) {
      return $$0.a(btr.t) ? false : super.b($$0);
   }
}
