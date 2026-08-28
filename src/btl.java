public abstract class btl extends bte {
   protected static final float bZ = 0.0F;

   protected btl(bsn<? extends btl> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public float c(ja $$0) {
      return this.a($$0, this.dR());
   }

   public float a(ja $$0, dcj $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dch $$0, btg $$1) {
      return this.a(this.dr(), $$0) >= 0.0F;
   }

   public boolean gj() {
      return !this.J().l();
   }

   public boolean gk() {
      if (this.bG.a(ccg.Z)) {
         return this.bG.c(ccg.Z).isPresent();
      } else {
         for (cbo $$0 : this.bU.b()) {
            if ($$0.h() && $$0.k() instanceof cat) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected void fY() {
      super.fY();
      bsh $$0 = this.gb();
      if ($$0 != null && $$0.dR() == this.dR()) {
         this.a($$0.dr(), 5);
         float $$1 = this.f($$0);
         if (this instanceof btz && ((btz)this).x()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.G($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bU.a(caa.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.dw() - this.dw()) / (double)$$1;
            double $$3 = ($$0.dy() - this.dy()) / (double)$$1;
            double $$4 = ($$0.dC() - this.dC()) / (double)$$1;
            this.j(this.du().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cs();
         } else if (this.gl() && !this.gk()) {
            this.bU.b(caa.a.a);
            float $$5 = 2.0F;
            ewh $$6 = new ewh($$0.dw() - this.dw(), $$0.dy() - this.dy(), $$0.dC() - this.dC()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.J().a(this.dw() + $$6.c, this.dy() + $$6.d, this.dC() + $$6.e, this.gm());
         }
      }
   }

   protected boolean gl() {
      return true;
   }

   protected double gm() {
      return 1.0;
   }

   protected void G(float $$0) {
   }
}
