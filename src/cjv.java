import javax.annotation.Nullable;

public class cjv extends cim {
   public cjv(bsc<? extends cjv> $$0, daz $$1) {
      super($$0, $$1);
      this.a(enn.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bT.a(3, new cbh<>(this, ckn.class, true));
      super.z();
   }

   @Override
   protected avh v() {
      return avi.Cz;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.CB;
   }

   @Override
   protected avh o_() {
      return avi.CA;
   }

   @Override
   avh u() {
      return avi.CC;
   }

   @Override
   protected void a(bqp $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof ciq $$4 && $$4.gq()) {
         $$4.gr();
         this.a((day)ctt.um);
      }
   }

   @Override
   protected void a(aym $$0, bpu $$1) {
      this.a(bsd.a, new ctq(ctt.oQ));
   }

   @Override
   protected void b(aym $$0, bpu $$1) {
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      btj $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(bty.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean C(brw $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bsq) {
            ((bsq)$$0).b(new bre(brg.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cme b(ctq $$0, float $$1) {
      cme $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bre $$0) {
      return $$0.a(brg.t) ? false : super.c($$0);
   }
}
