import java.util.List;

public class cph extends cpf {
   public static final float d = 4.0F;

   public cph(bur<? extends cph> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cph(dgi $$0, bvg $$1, fba $$2) {
      super(bur.K, $$1, $$2, $$0);
   }

   @Override
   protected void a(fay $$0) {
      super.a($$0);
      if ($$0.d() != fay.a.c || !this.e(((fax)$$0).a())) {
         if (!this.dW().C) {
            List<bvg> $$1 = this.dW().a(bvg.class, this.cR().c(4.0, 2.0, 4.0));
            bud $$2 = new bud(this.dW(), this.dB(), this.dD(), this.dH());
            buk $$3 = this.p();
            if ($$3 instanceof bvg) {
               $$2.a((bvg)$$3);
            }

            $$2.a(lt.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.c((7.0F - $$2.c()) / (float)$$2.g());
            $$2.a(new btp(btr.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (bvg $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dB(), $$4.dD(), $$4.dH());
                     break;
                  }
               }
            }

            this.dW().c(2006, this.dw(), this.bb() ? -1 : 1);
            this.dW().b($$2);
            this.at();
         }
      }
   }

   @Override
   protected lr s() {
      return lt.h;
   }

   @Override
   protected boolean m() {
      return false;
   }
}
